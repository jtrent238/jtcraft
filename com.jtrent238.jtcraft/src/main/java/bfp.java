/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ public class bfp
/*    */ {
/*  6 */   public static final bfp a = new bfp();
/*  7 */   private Random b = new Random();
/*    */   
/*  9 */   private String[] c = "the elder scrolls klaatu berata niktu xyzzy bless curse light darkness fire air earth water hot dry cold wet ignite snuff embiggen twist shorten stretch fiddle destroy imbue galvanize enchant free limited range of towards inside sphere cube self other ball mental physical grow shrink demon elemental spirit animal creature beast humanoid undead fresh stale ".split(" ");
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public String a()
/*    */   {
/* 34 */     int i = this.b.nextInt(2) + 3;
/* 35 */     String str = "";
/* 36 */     for (int j = 0; j < i; j++) {
/* 37 */       if (j > 0) str = str + " ";
/* 38 */       str = str + this.c[this.b.nextInt(this.c.length)];
/*    */     }
/* 40 */     return str;
/*    */   }
/*    */   
/*    */   public void a(long paramLong) {
/* 44 */     this.b.setSeed(paramLong);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bfp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */