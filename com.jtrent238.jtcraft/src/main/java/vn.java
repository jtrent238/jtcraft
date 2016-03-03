/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class vn
/*    */   extends vu
/*    */ {
/*    */   boolean a;
/*    */   private int b;
/*    */   
/*    */   public vn(td paramtd, boolean paramBoolean)
/*    */   {
/* 13 */     super(paramtd, false);
/* 14 */     this.a = paramBoolean;
/* 15 */     a(1);
/*    */   }
/*    */   
/*    */   public boolean a()
/*    */   {
/* 20 */     int i = this.c.aK();
/* 21 */     return (i != this.b) && (a(this.c.aJ(), false));
/*    */   }
/*    */   
/*    */   public void c()
/*    */   {
/* 26 */     this.c.d(this.c.aJ());
/* 27 */     this.b = this.c.aK();
/*    */     
/* 29 */     if (this.a) {
/* 30 */       double d = f();
/* 31 */       List localList = this.c.o.a(this.c.getClass(), azt.a(this.c.s, this.c.t, this.c.u, this.c.s + 1.0D, this.c.t + 1.0D, this.c.u + 1.0D).b(d, 10.0D, d));
/* 32 */       for (td localtd : localList) {
/* 33 */         if ((this.c != localtd) && 
/* 34 */           (localtd.o() == null) && 
/* 35 */           (!localtd.c(this.c.aJ()))) {
/* 36 */           localtd.d(this.c.aJ());
/*    */         }
/*    */       }
/*    */     }
/* 40 */     super.c();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\vn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */