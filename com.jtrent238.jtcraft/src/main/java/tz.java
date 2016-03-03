/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class tz
/*    */   extends uc
/*    */ {
/*    */   private int i;
/* 14 */   private int j = -1;
/*    */   
/*    */   public tz(sw paramsw) {
/* 17 */     super(paramsw);
/*    */   }
/*    */   
/*    */   public boolean a()
/*    */   {
/* 22 */     if (!super.a()) return false;
/* 23 */     if (!this.a.o.O().b("mobGriefing")) return false;
/* 24 */     return !this.e.f(this.a.o, this.b, this.c, this.d);
/*    */   }
/*    */   
/*    */   public void c()
/*    */   {
/* 29 */     super.c();
/* 30 */     this.i = 0;
/*    */   }
/*    */   
/*    */   public boolean b()
/*    */   {
/* 35 */     double d = this.a.e(this.b, this.c, this.d);
/* 36 */     return (this.i <= 240) && (!this.e.f(this.a.o, this.b, this.c, this.d)) && (d < 4.0D);
/*    */   }
/*    */   
/*    */   public void d()
/*    */   {
/* 41 */     super.d();
/* 42 */     this.a.o.d(this.a.y(), this.b, this.c, this.d, -1);
/*    */   }
/*    */   
/*    */   public void e()
/*    */   {
/* 47 */     super.e();
/* 48 */     if (this.a.aI().nextInt(20) == 0) {
/* 49 */       this.a.o.c(1010, this.b, this.c, this.d, 0);
/*    */     }
/*    */     
/* 52 */     this.i += 1;
/*    */     
/* 54 */     int k = (int)(this.i / 240.0F * 10.0F);
/* 55 */     if (k != this.j) {
/* 56 */       this.a.o.d(this.a.y(), this.b, this.c, this.d, k);
/* 57 */       this.j = k;
/*    */     }
/*    */     
/* 60 */     if ((this.i == 240) && 
/* 61 */       (this.a.o.r == rd.d)) {
/* 62 */       this.a.o.f(this.b, this.c, this.d);
/* 63 */       this.a.o.c(1012, this.b, this.c, this.d, 0);
/* 64 */       this.a.o.c(2001, this.b, this.c, this.d, aji.b(this.e));
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\tz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */