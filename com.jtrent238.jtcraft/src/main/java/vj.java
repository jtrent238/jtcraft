/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class vj
/*    */   extends ui
/*    */ {
/*    */   private yv a;
/*    */   private wt b;
/*    */   private int c;
/*    */   private boolean d;
/*    */   
/*    */   public vj(yv paramyv)
/*    */   {
/* 17 */     this.a = paramyv;
/* 18 */     a(3);
/*    */   }
/*    */   
/*    */   public boolean a()
/*    */   {
/* 23 */     if (this.a.d() >= 0) return false;
/* 24 */     if (!this.a.o.w()) { return false;
/*    */     }
/* 26 */     List localList = this.a.o.a(wt.class, this.a.C.b(6.0D, 2.0D, 6.0D));
/* 27 */     if (localList.isEmpty()) { return false;
/*    */     }
/* 29 */     for (wt localwt : localList) {
/* 30 */       if (localwt.cb() > 0) {
/* 31 */         this.b = localwt;
/* 32 */         break;
/*    */       }
/*    */     }
/* 35 */     return this.b != null;
/*    */   }
/*    */   
/*    */   public boolean b()
/*    */   {
/* 40 */     return this.b.cb() > 0;
/*    */   }
/*    */   
/*    */   public void c()
/*    */   {
/* 45 */     this.c = this.a.aI().nextInt(320);
/* 46 */     this.d = false;
/* 47 */     this.b.m().h();
/*    */   }
/*    */   
/*    */   public void d()
/*    */   {
/* 52 */     this.b = null;
/* 53 */     this.a.m().h();
/*    */   }
/*    */   
/*    */   public void e()
/*    */   {
/* 58 */     this.a.j().a(this.b, 30.0F, 30.0F);
/* 59 */     if (this.b.cb() == this.c) {
/* 60 */       this.a.m().a(this.b, 0.5D);
/* 61 */       this.d = true;
/*    */     }
/*    */     
/* 64 */     if ((this.d) && 
/* 65 */       (this.a.f(this.b) < 4.0D)) {
/* 66 */       this.b.a(false);
/* 67 */       this.a.m().h();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\vj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */