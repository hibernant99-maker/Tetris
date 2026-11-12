import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

public class Board extends JPanel implements ActionListener {
    private static final int B_width = 10;
    private static final int B_height = 20;
    private static final int Tile_size = 26;
    private static final int privew_size = 13;
    private static final int start_delay = 500;
    private static final int[] horizontal_kicks = { 0, -1, 1, -2, 2 };
    private static final Color[] colors = { Color.CYAN, Color.BLUE, Color.ORANGE, Color.YELLOW, Color.GREEN,
            Color.MAGENTA, Color.RED };
    private final int[][][] shapes = {
            { { 1, 1, 1, 1 } }, { { 1, 0, 0 }, { 1, 1, 1 } }, { { 0, 0, 1 }, { 1, 1, 1 } },
            { { 1, 1 }, { 1, 1 } }, { { 0, 1, 1 }, { 1, 1, 0 } }, { { 0, 1, 0 }, { 1, 1, 1 } },
            { { 1, 1, 0 }, { 0, 1, 1 } }
    };
    private int[][] board = new int[B_width][B_height];
    private final Queue<Integer> nextpieces = new ArrayDeque<>();
    private final List<Integer> pieceBag = new ArrayList<>();
    private final Timer timer;
    private final GameCanvas gameCanvas;
    private Tetromino currentPiece;
    private JButton pauseButton;

}

