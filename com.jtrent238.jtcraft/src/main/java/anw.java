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
/*    */ public class anw
/*    */   extends aji
/*    */ {
/* 16 */   public static final String[] a = { "default", "mossy", "cracked", "chiseled" };
/*    */   
/*    */ 
/*    */ 
/* 20 */   public static final String[] b = { null, "mossy", "cracked", "carved" };
/*    */   
/*    */   private rf[] M;
/*    */   
/*    */ 
/*    */   public anw()
/*    */   {
/* 27 */     super(awt.e);
/* 28 */     a(abt.b);
/*    */   }
/*    */   
/*    */   public rf a(int paramInt1, int paramInt2)
/*    */   {
/* 33 */     if ((paramInt2 < 0) || (paramInt2 >= b.length)) paramInt2 = 0;
/* 34 */     return this.M[paramInt2];
/*    */   }
/*    */   
/*    */   public int a(int paramInt)
/*    */   {
/* 39 */     return paramInt;
/*    */   }
/*    */   
/*    */   public void a(adb paramadb, abt paramabt, List paramList)
/*    */   {
/* 44 */     for (int i = 0; i < 4; i++) {
/* 45 */       paramList.add(new add(paramadb, 1, i));
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(rg paramrg)
/*    */   {
/* 51 */     this.M = new rf[b.length];
/*    */     
/* 53 */     for (int i = 0; i < this.M.length; i++) {
/* 54 */       String str = N();
/* 55 */       if (b[i] != null) str = str + "_" + b[i];
/* 56 */       this.M[i] = paramrg.a(str);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\anw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */