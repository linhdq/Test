package com.example.linhdq.test.documents.viewing.single.tts;

class OnUtteranceStart {
    private final String mUtteranceId;

    public OnUtteranceStart(String utteranceId) {

        mUtteranceId = utteranceId;
    }

    public Object getUtteranceId() {
        return mUtteranceId;
    }
}
