/*    */ import java.util.List;
/*    */ import java.util.Random;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class xh
/*    */   extends xg
/*    */ {
/*    */   private int b;
/*    */   public long a;
/*    */   private int c;
/*    */   
/*    */   public xh(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3)
/*    */   {
/* 26 */     super(paramahb);
/* 27 */     b(paramDouble1, paramDouble2, paramDouble3, 0.0F, 0.0F);
/* 28 */     this.b = 2;
/* 29 */     this.a = this.Z.nextLong();
/* 30 */     this.c = (this.Z.nextInt(3) + 1);
/*    */     
/* 32 */     if ((!paramahb.E) && (paramahb.O().b("doFireTick")) && ((paramahb.r == rd.c) || (paramahb.r == rd.d)) && (paramahb.a(qh.c(paramDouble1), qh.c(paramDouble2), qh.c(paramDouble3), 10)))
/*    */     {
/* 34 */       int i = qh.c(paramDouble1);
/* 35 */       int j = qh.c(paramDouble2);
/* 36 */       int k = qh.c(paramDouble3);
/* 37 */       if ((paramahb.a(i, j, k).o() == awt.a) && (ajn.ab.c(paramahb, i, j, k))) { paramahb.b(i, j, k, ajn.ab);
/*    */       }
/*    */       
/* 40 */       for (i = 0; i < 4; i++) {
/* 41 */         j = qh.c(paramDouble1) + this.Z.nextInt(3) - 1;
/* 42 */         k = qh.c(paramDouble2) + this.Z.nextInt(3) - 1;
/* 43 */         int m = qh.c(paramDouble3) + this.Z.nextInt(3) - 1;
/* 44 */         if ((paramahb.a(j, k, m).o() == awt.a) && (ajn.ab.c(paramahb, j, k, m))) paramahb.b(j, k, m, ajn.ab);
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public void h()
/*    */   {
/* 51 */     super.h();
/*    */     
/* 53 */     if (this.b == 2) {
/* 54 */       this.o.a(this.s, this.t, this.u, "ambient.weather.thunder", 10000.0F, 0.8F + this.Z.nextFloat() * 0.2F);
/* 55 */       this.o.a(this.s, this.t, this.u, "random.explode", 2.0F, 0.5F + this.Z.nextFloat() * 0.2F);
/*    */     }
/*    */     
/* 58 */     this.b -= 1;
/* 59 */     if (this.b < 0) {
/* 60 */       if (this.c == 0) {
/* 61 */         B();
/* 62 */       } else if (this.b < -this.Z.nextInt(10)) {
/* 63 */         this.c -= 1;
/* 64 */         this.b = 1;
/* 65 */         this.a = this.Z.nextLong();
/* 66 */         if ((!this.o.E) && (this.o.O().b("doFireTick")) && (this.o.a(qh.c(this.s), qh.c(this.t), qh.c(this.u), 10))) {
/* 67 */           int i = qh.c(this.s);
/* 68 */           int j = qh.c(this.t);
/* 69 */           int k = qh.c(this.u);
/* 70 */           if ((this.o.a(i, j, k).o() == awt.a) && (ajn.ab.c(this.o, i, j, k))) { this.o.b(i, j, k, ajn.ab);
/*    */           }
/*    */         }
/*    */       }
/*    */     }
/* 75 */     if (this.b >= 0) {
/* 76 */       if (this.o.E) {
/* 77 */         this.o.q = 2;
/*    */       } else {
/* 79 */         double d = 3.0D;
/* 80 */         List localList = this.o.b(this, azt.a(this.s - d, this.t - d, this.u - d, this.s + d, this.t + 6.0D + d, this.u + d));
/* 81 */         for (int m = 0; m < localList.size(); m++) {
/* 82 */           sa localsa = (sa)localList.get(m);
/* 83 */           localsa.a(this);
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   protected void c() {}
/*    */   
/*    */   protected void a(dh paramdh) {}
/*    */   
/*    */   protected void b(dh paramdh) {}
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\xh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */