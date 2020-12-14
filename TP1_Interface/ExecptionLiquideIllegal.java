package src;

public class ExecptionLiquideIllegal extends IllegalArgumentException  {

	public ExecptionLiquideIllegal(String bug) {
        super(bug);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}