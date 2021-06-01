package lesson28;

public interface Speakable {
    void speak();  //nói chuyện

    void whisper();  //nối thì thầm
}

class Speaking {
    private Speakable mSpeakable;

    public Speaking(Speakable mSpeakable) {
        this.mSpeakable = mSpeakable;
    }

    public void doSpeak() {
        System.out.println("Inside class speaking...");
        mSpeakable.speak();
        mSpeakable.whisper();
    }
}

class SpeakableExample {
    public static void main(String[] args) {
        //tạo đối tượng của lớp với tham số là lớp vô danh
        Speaking speaking = new Speaking(new Speakable() {
            @Override
            public void speak() {
                System.out.println("...v..v...");
            }

            @Override
            public void whisper() {
                System.out.println("I love u...");
            }
        });

        speaking.doSpeak();
    }
}
