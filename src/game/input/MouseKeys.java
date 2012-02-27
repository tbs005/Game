package game.input;

public enum MouseKeys 
{
    BUTTON_1(1), BUTTON_2(2), BUTTON_3(3);
    
    public final int KEYCODE;
    
    private MouseKeys(int keycode)
    {
        this.KEYCODE = keycode;
    }
}
