import java.util.HashMap;

class VotingSystem {
    private HashMap<String, Integer> candidates;

    public VotingSystem(String[] candidateNames) {
        candidates = new HashMap<>();
        for (String candidate : candidateNames) {
            candidates.put(candidate, 0);
        }
    }

    public void vote(String candidate) {
        if (candidates.containsKey(candidate)) {
            candidates.put(candidate, candidates.get(candidate) + 1);
            System.out.println("Voted for " + candidate);
        } else {
            System.out.println("Invalid candidate!");
        }
    }

    public void showResults() {
        System.out.println("Results:");
        for (String candidate : candidates.keySet()) {
            System.out.println(candidate + ": " + candidates.get(candidate) + " votes");
        }
    }
}

