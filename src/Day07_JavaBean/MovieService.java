package Day07_JavaBean;

import java.util.Scanner;

public class MovieService {
    private Movie[] movies;
    private Scanner sc = new Scanner(System.in);

    public MovieService(Movie[] movies) {
        this.movies = movies;
    }

    public void start() {
        lo:
        while (true) {
            System.out.println();
            System.out.println("1.展示所有影片");
            System.out.println("2.根据id展示影片");
            System.out.println("3.退出");
            System.out.println("请输入选项：");
            int id = sc.nextInt();

            switch (id) {
                case 1:
                    queryMovieInfo();
//                    System.out.println("展示所有影片");
                    break;
                case 2:
                    queryMovieInfoById();
//                    System.out.println("根据id展示影片");
                    break;
                case 3:
                    System.out.println("退出");
                    break lo;
                default:
                    System.out.println("输入有误");
                    break;
            }
        }
    }

    private void queryMovieInfoById() {
        System.out.println("请输入电影id:");
        int id = sc.nextInt();

        for (int i = 0; i < movies.length; i++) {
            Movie movie = movies[i];

            if (id == movie.getId()) {
                System.out.println(movie.getId() + " " + movie.getScore() + " " + movie.getArea() + " "
                        + movie.getDirector() + " " + movie.getStarring() + " " + movie.getTime() + " " + movie.getTitle() + " " + movie.getType());
                return;
            }
        }

        System.out.println("输入有误！");

    }

    private void queryMovieInfo() {
        for (int i = 0; i < movies.length; i++) {
            Movie movie = movies[i];
            System.out.println(movie.getId() + " " + movie.getScore() + " " + movie.getArea() + " "
            + movie.getDirector() + " " + movie.getStarring() + " " + movie.getTime() + " " + movie.getTitle() + " " + movie.getType());
        }
    }
}
