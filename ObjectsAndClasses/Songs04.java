package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs04 {

    static class Song {
        String typeList;
        String name;
        String time;
        // клас шаблон
        public Song (String typeList, String name, String time){
            // конструктор!!!
            this.typeList = typeList;
            this.name = name;
            this.time = time;
            // this служи, за да знае програмата кой тайпЛист примерно взима -
            // дали от класа горе или е параметъра от конструктора
    }

        public String getName() {
            return this.name;
            // това е get-ър, за да окажем, че ще вземем името на песен от обекта
        }

        public String getTypeList() {
            return this.typeList;
            //това е get-ър, за да окажем, че ще вземем типа на песен от обекта
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Song> SongList = new ArrayList<>();
        // създаваме лист, за да слагаме песните с данните им

        for (int i = 1; i <= n ; i++) {
        String input = scanner.nextLine();
        String [] inputSongArr = input.split("_");
        String typeListInput = inputSongArr[0];
        String nameInput = inputSongArr[1];
        String timeInput = inputSongArr[2];

        Song currentSong = new Song(typeListInput, nameInput, timeInput);
        // Това е обект в класа, като данните идват от конструктора

            SongList.add(currentSong);
            // създадения лист - към него прибавяме обект на всяка песен с данните й
        }
        String command = scanner.nextLine();
        if (command.equals("all")){
            for (Song item : SongList) {
                System.out.println(item.getName());
                //взимаме само името на песента от item,
                // като горе сме направили get-ър само за името, за момента
            }
        } else {
            for (Song item: SongList ) {
                String currentTypeList = item.getTypeList();
                if (currentTypeList.equals(command)){
                    System.out.println(item.getName());
                }

            }
        }
    }
}
