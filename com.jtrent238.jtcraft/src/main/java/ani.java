/*    */ import java.util.List;
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
/*    */ public class ani
/*    */   extends aji
/*    */ {
/* 16 */   public static final String[] a = { "default", "chiseled", "smooth" };
/*    */   
/*    */ 
/*    */ 
/* 20 */   private static final String[] b = { "normal", "carved", "smooth" };
/*    */   
/*    */   private rf[] M;
/*    */   
/*    */   private rf N;
/*    */   private rf O;
/*    */   
/*    */   public ani()
/*    */   {
/* 29 */     super(awt.e);
/* 30 */     a(abt.b);
/*    */   }
/*    */   
/*    */   public rf a(int paramInt1, int paramInt2)
/*    */   {
/* 35 */     if ((paramInt1 == 1) || ((paramInt1 == 0) && ((paramInt2 == 1) || (paramInt2 == 2)))) {
/* 36 */       return this.N;
/*    */     }
/* 38 */     if (paramInt1 == 0) {
/* 39 */       return this.O;
/*    */     }
/* 41 */     if ((paramInt2 < 0) || (paramInt2 >= this.M.length)) paramInt2 = 0;
/* 42 */     return this.M[paramInt2];
/*    */   }
/*    */   
/*    */   public int a(int paramInt)
/*    */   {
/* 47 */     return paramInt;
/*    */   }
/*    */   
/*    */   public void a(adb paramadb, abt paramabt, List paramList)
/*    */   {
/* 52 */     paramList.add(new add(paramadb, 1, 0));
/* 53 */     paramList.add(new add(paramadb, 1, 1));
/* 54 */     paramList.add(new add(paramadb, 1, 2));
/*    */   }
/*    */   
/*    */   public void a(rg paramrg)
/*    */   {
/* 59 */     this.M = new rf[b.length];
/*    */     
/* 61 */     for (int i = 0; i < this.M.length; i++) {
/* 62 */       this.M[i] = paramrg.a(N() + "_" + b[i]);
/*    */     }
/*    */     
/* 65 */     this.N = paramrg.a(N() + "_top");
/* 66 */     this.O = paramrg.a(N() + "_bottom");
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ani.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */