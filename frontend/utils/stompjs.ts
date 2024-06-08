import * as esm6 from '../node_modules/@stomp/stompjs/esm6/index';

declare global {
    namespace StompJs {
        export import Client = esm6.Client;
        export import Frame = esm6.Frame;
        export import Message = esm6.Message;
        export import Parser = esm6.Parser;
        export import StompConfig = esm6.StompConfig;
        export import StompHeaders = esm6.StompHeaders;
        export import StompSubscription = esm6.StompSubscription;
    }
}

const client = new StompJs.Client({
    brokerURL: "ws://localhost:8080/gs-guide-websocket",
    onConnect: () => {
        client.subscribe("/topic/lobby", (message) =>
            console.log(`Received: ${message.body}`)
        );
        client.publish({ destination: "/app/lobby/create", body: JSON.stringify({ playerId: "82e97135-29c1-44dc-b869-78c2b68d7340" }) });
    },
});

client.activate();