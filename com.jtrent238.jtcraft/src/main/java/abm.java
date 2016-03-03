/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class abm
/*    */   extends adb
/*    */ {
/* 11 */   public static final String[] a = { "pulling_0", "pulling_1", "pulling_2" };
/*    */   
/*    */   private rf[] b;
/*    */   
/*    */   public abm()
/*    */   {
/* 17 */     this.h = 1;
/* 18 */     f(384);
/* 19 */     a(abt.j);
/*    */   }
/*    */   
/*    */ 
/*    */   public void a(add paramadd, ahb paramahb, yz paramyz, int paramInt)
/*    */   {
/* 25 */     int i = (paramyz.bE.d) || (afv.a(aft.y.B, paramadd) > 0) ? 1 : 0;
/*    */     
/* 27 */     if ((i != 0) || (paramyz.bm.b(ade.g))) {
/* 28 */       int j = d_(paramadd) - paramInt;
/* 29 */       float f = j / 20.0F;
/* 30 */       f = (f * f + f * 2.0F) / 3.0F;
/* 31 */       if (f < 0.1D) return;
/* 32 */       if (f > 1.0F) { f = 1.0F;
/*    */       }
/* 34 */       zc localzc = new zc(paramahb, paramyz, f * 2.0F);
/* 35 */       if (f == 1.0F) localzc.a(true);
/* 36 */       int k = afv.a(aft.v.B, paramadd);
/* 37 */       if (k > 0) {
/* 38 */         localzc.b(localzc.e() + k * 0.5D + 0.5D);
/*    */       }
/* 40 */       int m = afv.a(aft.w.B, paramadd);
/* 41 */       if (m > 0) {
/* 42 */         localzc.a(m);
/*    */       }
/* 44 */       if (afv.a(aft.x.B, paramadd) > 0) {
/* 45 */         localzc.e(100);
/*    */       }
/* 47 */       paramadd.a(1, paramyz);
/*    */       
/* 49 */       paramahb.a(paramyz, "random.bow", 1.0F, 1.0F / (g.nextFloat() * 0.4F + 1.2F) + f * 0.5F);
/* 50 */       if (i != 0) {
/* 51 */         localzc.a = 2;
/*    */       } else {
/* 53 */         paramyz.bm.a(ade.g);
/*    */       }
/* 55 */       if (!paramahb.E) paramahb.d(localzc);
/*    */     }
/*    */   }
/*    */   
/*    */   public add b(add paramadd, ahb paramahb, yz paramyz)
/*    */   {
/* 61 */     return paramadd;
/*    */   }
/*    */   
/*    */   public int d_(add paramadd)
/*    */   {
/* 66 */     return 72000;
/*    */   }
/*    */   
/*    */   public aei d(add paramadd)
/*    */   {
/* 71 */     return aei.e;
/*    */   }
/*    */   
/*    */   public add a(add paramadd, ahb paramahb, yz paramyz)
/*    */   {
/* 76 */     if ((paramyz.bE.d) || (paramyz.bm.b(ade.g))) {
/* 77 */       paramyz.a(paramadd, d_(paramadd));
/*    */     }
/* 79 */     return paramadd;
/*    */   }
/*    */   
/*    */   public int c()
/*    */   {
/* 84 */     return 1;
/*    */   }
/*    */   
/*    */   public void a(rg paramrg)
/*    */   {
/* 89 */     this.k = paramrg.a(w() + "_standby");
/*    */     
/* 91 */     this.b = new rf[a.length];
/*    */     
/* 93 */     for (int i = 0; i < this.b.length; i++) {
/* 94 */       this.b[i] = paramrg.a(w() + "_" + a[i]);
/*    */     }
/*    */   }
/*    */   
/*    */   public rf c(int paramInt) {
/* 99 */     return this.b[paramInt];
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\abm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */