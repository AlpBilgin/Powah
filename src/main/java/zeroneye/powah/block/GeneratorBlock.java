package zeroneye.powah.block;

public class GeneratorBlock extends PowahBlock {
    private final int perTick;

    public GeneratorBlock(Properties properties, int capacity, int transfer, int perTick) {
        super(properties, capacity, transfer);
        this.perTick = perTick;
    }

    public int perTick() {
        return perTick;
    }
}
