public final class Token {

    public static String botToken() {
        String check = System.getenv("DISCORD_BOT_TOKEN");
        if (check == null) {
            System.out.println("Missing Bot Token.");
            return "MISSING";
        } else {
            return check;
        }
    }

    public static String UhToken () {

        String check = System.getenv("DISCORD_BOT_UPTIME_HOOK_TOKEN");
        if (check == null) {
            System.out.println("Missing Uptime Webhook Token.");
            return "MISSING";
        } else {
            return check;
        }
    }

    public static String UhID () {
        String check = System.getenv("DISCORD_BOT_UPTIME_HOOK_ID");
        if (check == null) {
            System.out.println("Missing Uptime Webhook ID.");
            return "MISSING";
        } else {
            return check;
        }
    }

    private Token () {}

}
