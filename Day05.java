/*1845. Seat Reservation Manager
Link:-https://leetcode.com/problems/seat-reservation-manager/description/
 My Solution in Java:-Day 05 of 75
 */
class SeatManager {

    private int next;
    private PriorityQueue<Integer> heap;

    public SeatManager(int n) {
        next = 1;
        heap = new PriorityQueue<>();
    }

    public int reserve() {
        if (!heap.isEmpty() && heap.peek() < next) {
            return heap.poll();
        }

        next++;
        return next - 1;
    }

    public void unreserve(int seatNumber) {
        heap.offer(seatNumber);
    }
}


