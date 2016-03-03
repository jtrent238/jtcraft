/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class va
/*    */   extends ui
/*    */ {
/*    */   private yv a;
/*    */   private sv b;
/*    */   private double c;
/*    */   private int d;
/*    */   
/*    */   public va(yv paramyv, double paramDouble)
/*    */   {
/* 19 */     this.a = paramyv;
/* 20 */     this.c = paramDouble;
/* 21 */     a(1);
/*    */   }
/*    */   
/*    */   public boolean a()
/*    */   {
/* 26 */     if (this.a.d() >= 0) return false;
/* 27 */     if (this.a.aI().nextInt(400) != 0) { return false;
/*    */     }
/* 29 */     List localList = this.a.o.a(yv.class, this.a.C.b(6.0D, 3.0D, 6.0D));
/* 30 */     double d1 = Double.MAX_VALUE;
/* 31 */     for (Object localObject = localList.iterator(); ((Iterator)localObject).hasNext();) { yv localyv = (yv)((Iterator)localObject).next();
/* 32 */       if ((localyv != this.a) && 
/* 33 */         (!localyv.cb()) && 
/* 34 */         (localyv.d() < 0)) {
/* 35 */         double d2 = localyv.f(this.a);
/* 36 */         if (d2 <= d1) {
/* 37 */           d1 = d2;
/* 38 */           this.b = localyv;
/*    */         }
/*    */       } }
/* 41 */     if (this.b == null) {
/* 42 */       localObject = vx.a(this.a, 16, 3);
/* 43 */       if (localObject == null) return false;
/*    */     }
/* 45 */     return true;
/*    */   }
/*    */   
/*    */   public boolean b()
/*    */   {
/* 50 */     return this.d > 0;
/*    */   }
/*    */   
/*    */   public void c()
/*    */   {
/* 55 */     if (this.b != null) this.a.j(true);
/* 56 */     this.d = 1000;
/*    */   }
/*    */   
/*    */   public void d()
/*    */   {
/* 61 */     this.a.j(false);
/* 62 */     this.b = null;
/*    */   }
/*    */   
/*    */   public void e()
/*    */   {
/* 67 */     this.d -= 1;
/* 68 */     if (this.b != null) {
/* 69 */       if (this.a.f(this.b) > 4.0D) this.a.m().a(this.b, this.c);
/*    */     }
/* 71 */     else if (this.a.m().g()) {
/* 72 */       azw localazw = vx.a(this.a, 16, 3);
/* 73 */       if (localazw == null) return;
/* 74 */       this.a.m().a(localazw.a, localazw.b, localazw.c, this.c);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\va.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */