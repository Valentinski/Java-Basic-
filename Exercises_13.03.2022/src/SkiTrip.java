import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Първи ред - дни за престой - цяло число в интервала [0...365]
        int stay = Integer.parseInt(scanner.nextLine());
        //•	Втори ред - вид помещение - "room for one person", "apartment" или "president apartment"
        String place = scanner.nextLine();
        //•	Трети ред - оценка - "positive"  или "negative"
        String rating = scanner.nextLine();

        double priceProNight = 0;
        int overnights = stay - 1;
        double priceOfOnePerson = 18.00 * overnights; // room for one person"
        double priceOfApartment = 25.00 * overnights;
        double priceOfPresidentApartment = 35.00 * overnights;

        switch (place){
            case "room for one person":
                if(stay < 10){
                    if(rating.equals("positive")){
                        priceOfOnePerson = priceOfOnePerson + priceOfOnePerson*0.25;
                        priceProNight = priceOfOnePerson ;

                    }else if (rating.equals("negative")){
                        priceOfOnePerson = priceOfOnePerson - priceOfOnePerson*0.1;
                        priceProNight = priceOfOnePerson;

                        }
                }else if (stay >= 10 && stay <= 15 ){
                    if(rating.equals("positive")){
                        priceOfOnePerson = priceOfOnePerson + priceOfOnePerson*0.25;
                        priceProNight = priceOfOnePerson;

                    }else if (rating.equals("negative")){
                        priceOfOnePerson = priceOfOnePerson - priceOfOnePerson*0.1;
                        priceProNight = priceOfOnePerson;

                    }
                }else{
                    if(rating.equals("positive")){
                        priceProNight = priceOfOnePerson + priceOfApartment * 0.25;
                        priceProNight = priceOfOnePerson;

                    }else if (rating.equals("negative")){
                        priceOfOnePerson = priceOfOnePerson - priceProNight * 0.1;
                        priceProNight = priceOfOnePerson;

                    }

                }
                break;
            case "apartment":
                if(stay < 10){
                    if(rating.equals("positive")){
                        priceOfApartment = priceOfApartment - priceOfApartment*0.30;
                        priceProNight = priceOfApartment + priceOfApartment * 0.25;
                    }else if (rating.equals("negative")){
                        priceOfApartment = priceOfApartment - priceOfApartment*0.30;
                        priceProNight = priceOfApartment - priceOfApartment * 0.10;

                    }

                }else if (stay >= 10 && stay <= 15 ){
                    if(rating.equals("positive")){
                        priceOfApartment = priceOfApartment - priceOfApartment * 0.35;
                        priceProNight = priceOfApartment + priceOfApartment * 0.25;

                    }else if (rating.equals("negative")){
                        priceOfApartment = priceOfApartment - priceOfApartment*0.35;
                        priceProNight = priceOfApartment - priceOfApartment * 0.10;

                    }

                }else{
                    if(rating.equals("positive")){
                        priceOfApartment = priceOfApartment - priceOfApartment * 0.50;
                        priceProNight = priceOfApartment + priceOfApartment * 0.25;

                    }else if (rating.equals("negative")){
                        priceOfApartment = priceOfApartment - priceOfApartment * 0.50;
                        priceProNight = priceOfApartment - priceOfApartment * 0.1;
                    }
                }
                break;

            case "president apartment":
                if(stay < 10){
                    if(rating.equals("positive")){
                        priceOfPresidentApartment = priceOfPresidentApartment - priceOfPresidentApartment * 0.10;
                        priceProNight = priceOfPresidentApartment + priceOfPresidentApartment * 0.25;

                    }else if (rating.equals("negative")){
                        priceOfPresidentApartment = priceOfPresidentApartment - priceOfPresidentApartment * 0.10;
                        priceProNight = priceOfPresidentApartment - priceOfPresidentApartment *0.1;

                    }

                }else if (stay >= 10 && stay <= 15 ){
                    if(rating.equals("positive")){
                        priceOfPresidentApartment = priceOfPresidentApartment - priceOfPresidentApartment * 0.15;
                        priceProNight = priceOfPresidentApartment + priceOfPresidentApartment * 0.25;

                    }else if (rating.equals("negative")){
                        priceOfPresidentApartment = priceOfPresidentApartment - priceOfPresidentApartment * 0.15;
                        priceProNight = priceOfPresidentApartment - priceOfPresidentApartment * 0.1;

                    }

                }else{
                    if(rating.equals("positive")){
                        priceOfPresidentApartment = priceOfPresidentApartment - priceOfPresidentApartment * 0.20;
                        priceProNight = priceOfPresidentApartment + priceOfPresidentApartment * 0.25;

                    }else if (rating.equals("negative")){
                        priceOfPresidentApartment = priceOfPresidentApartment - priceOfPresidentApartment * 0.20;
                        priceProNight = priceOfPresidentApartment - priceOfPresidentApartment * 0.1;

                    }

                }
                break;

        }

        System.out.printf("%.2f", priceProNight);

    }
}
