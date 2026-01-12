import doodlepad.*;

public class LemonDoodle
{
    // The box to drive around the Pad
    private Rectangle box;

    public LemonDoodle() {
        // Explicitly create a Pad and handle key-pressed event
        Pad p = new Pad(600, 600);
        p.setKeyPressedHandler( this::onKeyPressed );

        // Create ans style the box to drive
        box = new Rectangle(100, 100, 50, 50);
        box.setFillColor(0, 0, 255);
    }

    // Key pressed event handler moves box according key pressed
    public void onKeyPressed(Pad p, String keyText, String keyMods) {
        if (keyText.equals("Left") || keyText.equals("a")) {
            box.move(-10, 0);
        } else if (keyText.equals("Right") || keyText.equals("d")) {
            box.move(10, 0);
        } else if (keyText.equals("Up") || keyText.equals("w")) {
            box.move(0, -10);
        } else if (keyText.equals("Down") || keyText.equals("s")) {
            box.move(0, 10);
        }
    }

    public static void main(String[] args) {
        LemonDoodle myLemonDoodle = new LemonDoodle();
    }
}
