/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ux
/*    */   extends ui
/*    */ {
/*    */   private wt a;
/*    */   private yv b;
/*    */   private int c;
/*    */   
/*    */   public ux(wt paramwt)
/*    */   {
/* 15 */     this.a = paramwt;
/* 16 */     a(3);
/*    */   }
/*    */   
/*    */   public boolean a()
/*    */   {
/* 21 */     if (!this.a.o.w()) return false;
/* 22 */     if (this.a.aI().nextInt(8000) != 0) return false;
/* 23 */     this.b = ((yv)this.a.o.a(yv.class, this.a.C.b(6.0D, 2.0D, 6.0D), this.a));
/* 24 */     return this.b != null;
/*    */   }
/*    */   
/*    */   public boolean b()
/*    */   {
/* 29 */     return this.c > 0;
/*    */   }
/*    */   
/*    */   public void c()
/*    */   {
/* 34 */     this.c = 400;
/* 35 */     this.a.a(true);
/*    */   }
/*    */   
/*    */   public void d()
/*    */   {
/* 40 */     this.a.a(false);
/* 41 */     this.b = null;
/*    */   }
/*    */   
/*    */   public void e()
/*    */   {
/* 46 */     this.a.j().a(this.b, 30.0F, 30.0F);
/* 47 */     this.c -= 1;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ux.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */