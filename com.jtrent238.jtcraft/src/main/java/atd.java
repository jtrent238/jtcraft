/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class atd
/*    */   extends ave
/*    */ {
/* 11 */   private List e = new ArrayList();
/*    */   
/*    */ 
/*    */   public atd()
/*    */   {
/* 16 */     this.e.add(new ahx(xx.class, 10, 2, 3));
/* 17 */     this.e.add(new ahx(yh.class, 5, 4, 4));
/* 18 */     this.e.add(new ahx(yl.class, 10, 4, 4));
/* 19 */     this.e.add(new ahx(yf.class, 3, 4, 4));
/*    */   }
/*    */   
/*    */   public String a()
/*    */   {
/* 24 */     return "Fortress";
/*    */   }
/*    */   
/*    */   public List b()
/*    */   {
/* 29 */     return this.e;
/*    */   }
/*    */   
/*    */ 
/*    */   protected boolean a(int paramInt1, int paramInt2)
/*    */   {
/* 35 */     int i = paramInt1 >> 4;
/* 36 */     int j = paramInt2 >> 4;
/*    */     
/* 38 */     this.b.setSeed(i ^ j << 4 ^ this.c.H());
/* 39 */     this.b.nextInt();
/*    */     
/* 41 */     if (this.b.nextInt(3) != 0) {
/* 42 */       return false;
/*    */     }
/* 44 */     if (paramInt1 != (i << 4) + 4 + this.b.nextInt(8)) {
/* 45 */       return false;
/*    */     }
/* 47 */     if (paramInt2 != (j << 4) + 4 + this.b.nextInt(8)) {
/* 48 */       return false;
/*    */     }
/* 50 */     return true;
/*    */   }
/*    */   
/*    */   protected avm b(int paramInt1, int paramInt2)
/*    */   {
/* 55 */     return new ate(this.c, this.b, paramInt1, paramInt2);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\atd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */