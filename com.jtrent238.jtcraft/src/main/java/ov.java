/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ov
/*    */   implements ac
/*    */ {
/* 11 */   public static final ov a = new ov();
/*    */   
/* 13 */   private StringBuffer b = new StringBuffer();
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public String b_()
/*    */   {
/* 25 */     return "Rcon";
/*    */   }
/*    */   
/*    */   public fj c_()
/*    */   {
/* 30 */     return new fq(b_());
/*    */   }
/*    */   
/*    */   public void a(fj paramfj)
/*    */   {
/* 35 */     this.b.append(paramfj.c());
/*    */   }
/*    */   
/*    */   public boolean a(int paramInt, String paramString)
/*    */   {
/* 40 */     return true;
/*    */   }
/*    */   
/*    */   public r f_()
/*    */   {
/* 45 */     return new r(0, 0, 0);
/*    */   }
/*    */   
/*    */   public ahb d()
/*    */   {
/* 50 */     return MinecraftServer.I().d();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ov.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */