import java.util.Arrays;

class Competition {
    private String name;
    private Participant[] participants;
    int ageLimit;
    private int size;

    public Competition(String name, int maxParticipants, int ageLimit) {
        this.name = name;
        this.ageLimit = ageLimit;
        this.participants = new Participant[maxParticipants];
    }

    void addParticipant(Participant participant) {
        if (ageLimit<participant.getAge())
        {throw new AgeViolationException("Nieodpowiedni wiek");}
        //if (participant.equals(participant))
        //{throw new DuplicateException("Dodajesz następny raz taką samą osobę");}
        participants[size] = participant;
        size++;
    }

    boolean hasFreeSpots() {
        return size < participants.length;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Zawody ")
                .append(name)
                .append("\n")
                .append("Liczba uczestników: ").append(size);
        for (int i = 0; i < size; i++) {
            builder.append("\n");
            builder.append(" > ");
            builder.append(participants[i].toString());
        }
        return builder.toString();
    }
}