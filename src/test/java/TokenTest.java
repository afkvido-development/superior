import org.junit.jupiter.api.Test;


class TokenTest {

    @Test void BotToken() {
        String t = Token.botToken();
        System.out.println("Bot Token: " + t);
    }

    @Test void UhToken() {
        String t = Token.UhToken();
        System.out.println("Uptime Webhook Token: " + t);
    }

    @Test void UhID() {
        String t = Token.UhID();
        System.out.println("Uptime Webhook ID: " + t);
    }
}