import java.util.LinkedList;

class Hundestaffel {

    private LinkedList<Hund> hunde;

    public Hundestaffel() {
        hunde = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            hunde.add(new Hund());
        }
    }

    public void alleBellen() {
        for (Hund hund : hunde) {
            hund.bellen();
        }
    }

    public void teilweiseBellen() {
        for (int i = 0; i < hunde.size(); i += 2) {
            hunde.get(i).bellen();
        }
    }

    public void teilweiseEntfernen() {
        for (int i = hunde.size() - 1; i >= 0; i -= 2) {
            hunde.remove(i);
        }
    }
    public void removeFirstLast(){
        hunde.removeLast();
        hunde.removeFirst();
    }
    public Hund getFirstHund() {
        return hunde.peekFirst();
    }
    public void customRemove(int pos) {
        hunde.set(pos, new Hund());
    }
    public boolean checkHund(String Hund) {
        for (Hund hundeliste : hunde) {
            return hundeliste.getName() == Hund;
        }
        return false;
    }
}