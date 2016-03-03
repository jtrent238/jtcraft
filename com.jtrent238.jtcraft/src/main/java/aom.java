/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aom
/*    */   extends aji
/*    */ {
/* 11 */   public static final String[] a = { "oak", "spruce", "birch", "jungle", "acacia", "big_oak" };
/*    */   
/*    */   private rf[] b;
/*    */   
/*    */ 
/*    */   public aom()
/*    */   {
/* 18 */     super(awt.d);
/* 19 */     a(abt.b);
/*    */   }
/*    */   
/*    */   public rf a(int paramInt1, int paramInt2)
/*    */   {
/* 24 */     if ((paramInt2 < 0) || (paramInt2 >= this.b.length)) {
/* 25 */       paramInt2 = 0;
/*    */     }
/* 27 */     return this.b[paramInt2];
/*    */   }
/*    */   
/*    */   public int a(int paramInt)
/*    */   {
/* 32 */     return paramInt;
/*    */   }
/*    */   
/*    */   public void a(adb paramadb, abt paramabt, List paramList)
/*    */   {
/* 37 */     paramList.add(new add(paramadb, 1, 0));
/* 38 */     paramList.add(new add(paramadb, 1, 1));
/* 39 */     paramList.add(new add(paramadb, 1, 2));
/* 40 */     paramList.add(new add(paramadb, 1, 3));
/* 41 */     paramList.add(new add(paramadb, 1, 4));
/* 42 */     paramList.add(new add(paramadb, 1, 5));
/*    */   }
/*    */   
/*    */   public void a(rg paramrg)
/*    */   {
/* 47 */     this.b = new rf[a.length];
/*    */     
/* 49 */     for (int i = 0; i < this.b.length; i++) {
/* 50 */       this.b[i] = paramrg.a(N() + "_" + a[i]);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aom.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */