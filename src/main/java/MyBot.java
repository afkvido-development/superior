import discord4j.core.DiscordClient;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.event.domain.lifecycle.ReadyEvent;
import discord4j.core.object.entity.User;
import reactor.core.publisher.Mono;

public class MyBot {

    public static void main (String[] args) {

        DiscordClient client = DiscordClient.create(Token.botToken());

        Mono<Void> login = client.withGateway((GatewayDiscordClient gateway) ->
                gateway.on(ReadyEvent.class, event ->
                        Mono.fromRunnable(() -> {
                            final User self = event.getSelf();
                            System.out.printf("Logged in as %s#%s%n", self.getUsername(), self.getDiscriminator());
                        })));




        login.block();



    }


}
