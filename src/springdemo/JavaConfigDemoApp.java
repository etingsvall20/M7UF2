package springdemo;

public class JavaConfigDemoApp {

    public static void main (String[] args) {
        //read spring config from Java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportsConfig.class);

        //get the bean from spring container
        TennisCoach coach = context.getBean("tennisCoach", TennisCoach.class);

        //call a method on the bean
        System.out.println(coach.getDailyPractice());

        //call method from dependency class
        System.out.println(coach.getLastGameStats());
        System.out.println(coach.getAudience());

        //checkout literal injection from properties file
        System.out.println(coach.getEmailAddress());
        System.out.println(coach.getTeam());

        //close the context
        context.close();

    }

}
