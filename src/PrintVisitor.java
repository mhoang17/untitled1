import gen.*;

public class PrintVisitor extends mogensBaseVisitor<CompilerObject> {

    @Override
    public CompilerObject visitStart(mogensParser.StartContext ctx) {
        return super.visitStart(ctx);
    }

    @Override
    public CompilerObject visitStmt(mogensParser.StmtContext ctx) {
        return super.visitStmt(ctx);
    }

    @Override
    public CompilerObject visitStmts(mogensParser.StmtsContext ctx) {
        return super.visitStmts(ctx);
    }

    @Override
    public CompilerObject visitE(mogensParser.EContext ctx) {
        return super.visitE(ctx);
    }

    @Override
    public CompilerObject visitT(mogensParser.TContext ctx) {
        System.out.println(ctx.ID().getText());
        return super.visitT(ctx);
    }
}
