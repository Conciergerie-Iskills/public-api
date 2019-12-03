package fr.iskills.web.publicapi.ackMessage;

import fr.iskills.web.publicapi.genericModel.Input;
import fr.iskills.web.publicapi.genericModel.NotNull;
import fr.iskills.web.publicapi.getMessageThreads.MessageThreadType;

import java.util.ArrayList;
import java.util.List;

public class AckMessageInput extends Input {
    @NotNull
    private AckMessageInputData data = new AckMessageInputData();

    public AckMessageInputData getData() {
        return data;
    }

    public static class AckMessageInputData {
        @NotNull
        private List<Integer> messageIds = new ArrayList<>();
        @NotNull
        private int targetId;
        @NotNull
        private String messageThreadType;

        public void add(Integer i) {
            messageIds.add(i);
        }

        public int getTargetId() {
            return targetId;
        }

        public void setTargetId(int targetId) {
            this.targetId = targetId;
        }

        public MessageThreadType getMessageThreadType() {
            return MessageThreadType.valueOf(messageThreadType);
        }

        public void setMessageThreadType(MessageThreadType type) {
            this.messageThreadType = type.name();
        }
        public List<Integer> getMessageIds() {
            return messageIds;
        }
    }
}
