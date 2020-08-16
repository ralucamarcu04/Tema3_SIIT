package org.example.app1;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        ArrayList<String> arrayTitles = new ArrayList<>();
        ArrayList<Integer> arrayPages = new ArrayList<>();
        ArrayList<String> arrayType = new ArrayList<>();
        ArrayList<String> arrayGenre = new ArrayList<>();
        ArrayList<String> arrayPaperQuality = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Please add the title of the book:");
        String title = scan.nextLine();
        scan = new Scanner(System.in);
        System.out.println("Please add the number of pages:");
        arrayTitles.add(title);
        Integer pages = Integer.valueOf(scan.nextLine());
        arrayPages.add(pages);
        scan = new Scanner(System.in);
        System.out.println("Please specify the type of book: novel/art album");
        String type = scan.nextLine();
        arrayType.add(type);
        if (arrayType.add(type)==Boolean.parseBoolean("novel")) {
            scan = new Scanner(System.in);
            System.out.println("Please specify the novel's genre: sf/mystery/historical.");
            String genre = scan.nextLine();
            arrayGenre.add(genre);
        }
        else {
            scan = new Scanner(System.in);
            System.out.println("Please specify the art album's paper quality: high/medium/low.");
            String paperQuality = scan.nextLine();
            arrayPaperQuality.add(paperQuality);
        }
        scan = new Scanner(System.in);
        System.out.println("Please write 'next' if you want to add another book to the list.");
        String next = scan.nextLine();
        i++;

            while (next.equals("next")) {
                scan = new Scanner(System.in);
                System.out.println("Please add the title of the book:");
                title = scan.nextLine();
                scan = new Scanner(System.in);
                System.out.println("Please add the number of pages:");
                arrayTitles.add(title);
                pages = Integer.valueOf(scan.nextLine());
                arrayPages.add(pages);
                scan = new Scanner(System.in);
                System.out.println("Please specify the type of book: novel/art album");
                type = scan.nextLine();
                arrayType.add(type);
                if (arrayType.add(type)==Boolean.parseBoolean("novel")) {
                    scan = new Scanner(System.in);
                    System.out.println("Please specify the novel's genre: sf/mystery/historical.");
                    String genre = scan.nextLine();
                    arrayGenre.add(genre);
                }
                else {
                    scan = new Scanner(System.in);
                    System.out.println("Please specify the art album's paper quality: high/medium/low.");
                    String paperQuality = scan.nextLine();
                    arrayPaperQuality.add(paperQuality);
                }
                scan = new Scanner(System.in);
                System.out.println("Please write 'next' if you want to add another book to the list.");
                next = scan.nextLine();
                i++;
            }
            scan = new Scanner(System.in);
            System.out.println("Would you like to remove/list books?");
            String answer = scan.nextLine();
                if (answer.equals("list")){
                 int index;
                 scan = new Scanner(System.in);
                 System.out.println("Please add the number of the book you want to list.");
                 index = Integer.parseInt(scan.nextLine());
                 final String s = arrayTitles.get(index);
            }
            if (answer.equals("remove")) {
                int index;
                scan = new Scanner(System.in);
                System.out.println("Please add the number of the book you want to remove.");
                index = Integer.parseInt(scan.nextLine());
                arrayTitles.remove(index);
                arrayPages.remove(index);
                arrayType.remove(index);
            }
        }
        }
