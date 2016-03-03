/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aka
/*    */   extends aji
/*    */ {
/*    */   private rf[] a;
/*    */   
/*    */   public aka(awt paramawt)
/*    */   {
/* 15 */     super(paramawt);
/* 16 */     a(abt.b);
/*    */   }
/*    */   
/*    */   public rf a(int paramInt1, int paramInt2)
/*    */   {
/* 21 */     return this.a[(paramInt2 % this.a.length)];
/*    */   }
/*    */   
/*    */   public int a(int paramInt)
/*    */   {
/* 26 */     return paramInt;
/*    */   }
/*    */   
/*    */   public static int b(int paramInt) {
/* 30 */     return c(paramInt);
/*    */   }
/*    */   
/*    */   public static int c(int paramInt) {
/* 34 */     return (paramInt ^ 0xFFFFFFFF) & 0xF;
/*    */   }
/*    */   
/*    */   public void a(adb paramadb, abt paramabt, List paramList)
/*    */   {
/* 39 */     for (int i = 0; i < 16; i++) {
/* 40 */       paramList.add(new add(paramadb, 1, i));
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(rg paramrg)
/*    */   {
/* 46 */     this.a = new rf[16];
/*    */     
/* 48 */     for (int i = 0; i < this.a.length; i++) {
/* 49 */       this.a[i] = paramrg.a(N() + "_" + acj.b[c(i)]);
/*    */     }
/*    */   }
/*    */   
/*    */   public awv f(int paramInt)
/*    */   {
/* 55 */     return awv.a(paramInt);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */