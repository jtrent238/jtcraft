/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class vg
/*    */   extends ui
/*    */ {
/*    */   private wi a;
/*    */   private double b;
/*    */   private double c;
/*    */   private double d;
/*    */   private double e;
/*    */   
/*    */   public vg(wi paramwi, double paramDouble)
/*    */   {
/* 16 */     this.a = paramwi;
/* 17 */     this.b = paramDouble;
/* 18 */     a(1);
/*    */   }
/*    */   
/*    */   public boolean a()
/*    */   {
/* 23 */     if ((this.a.cc()) || (this.a.l == null)) return false;
/* 24 */     azw localazw = vx.a(this.a, 5, 4);
/* 25 */     if (localazw == null) return false;
/* 26 */     this.c = localazw.a;
/* 27 */     this.d = localazw.b;
/* 28 */     this.e = localazw.c;
/* 29 */     return true;
/*    */   }
/*    */   
/*    */   public void c()
/*    */   {
/* 34 */     this.a.m().a(this.c, this.d, this.e, this.b);
/*    */   }
/*    */   
/*    */   public boolean b()
/*    */   {
/* 39 */     return (!this.a.m().g()) && (this.a.l != null);
/*    */   }
/*    */   
/*    */   public void e()
/*    */   {
/* 44 */     if (this.a.aI().nextInt(50) == 0)
/*    */     {
/* 46 */       if ((this.a.l instanceof yz)) {
/* 47 */         int i = this.a.cq();
/* 48 */         int j = this.a.cw();
/* 49 */         if ((j > 0) && (this.a.aI().nextInt(j) < i)) {
/* 50 */           this.a.h((yz)this.a.l);
/* 51 */           this.a.o.a(this.a, (byte)7);
/* 52 */           return;
/*    */         }
/* 54 */         this.a.v(5);
/*    */       }
/*    */       
/* 57 */       this.a.l.a(null);
/* 58 */       this.a.l = null;
/* 59 */       this.a.cJ();
/* 60 */       this.a.o.a(this.a, (byte)6);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\vg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */