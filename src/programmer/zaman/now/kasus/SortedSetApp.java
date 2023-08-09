package programmer.zaman.now.kasus;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {
        SortedSet<Task> tasks = new TreeSet<>((o1, o2) -> o1.getDeadline().compareTo(o2.getDeadline()));

        // Menambahkan tugas-tugas ke dalam SortedSet
        tasks.add(new Task("Mengumpulkan data", "2023-07-31"));
        tasks.add(new Task("Menganalisis data", "2023-08-05"));
        tasks.add(new Task("Menulis laporan", "2023-05-10"));

        // Menampilkan tugas-tugas yang diurutkan berdasarkan tenggat waktu
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}
class  Task {
    private String name;
    private String deadline;

    public Task(String name, String deadline) {
        this.name = name;
        this.deadline = deadline;
    }

    public String getName() {
        return name;
    }

    public String getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return name + " (Deadline: " + deadline + ")";
    }
}
