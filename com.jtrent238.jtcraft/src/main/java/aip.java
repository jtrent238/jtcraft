/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aip
/*    */   extends ahu
/*    */ {
/*    */   protected boolean aC;
/*    */   
/*    */   protected aip(int paramInt)
/*    */   {
/* 14 */     super(paramInt);
/*    */     
/* 16 */     a(0.8F, 0.4F);
/* 17 */     a(e);
/*    */     
/* 19 */     this.at.add(new ahx(wi.class, 5, 2, 6));
/*    */     
/* 21 */     this.ar.x = 64537;
/* 22 */     this.ar.y = 4;
/* 23 */     this.ar.z = 10;
/*    */   }
/*    */   
/*    */   public String a(Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 28 */     double d = ad.a(paramInt1 / 200.0D, paramInt3 / 200.0D);
/* 29 */     int i; if (d < -0.8D) {
/* 30 */       i = paramRandom.nextInt(4);
/* 31 */       return alc.a[(4 + i)];
/*    */     }
/* 33 */     if (paramRandom.nextInt(3) > 0) {
/* 34 */       i = paramRandom.nextInt(3);
/* 35 */       if (i == 0)
/* 36 */         return alc.a[0];
/* 37 */       if (i == 1) {
/* 38 */         return alc.a[3];
/*    */       }
/* 40 */       return alc.a[8];
/*    */     }
/*    */     
/* 43 */     return alc.b[0];
/*    */   }
/*    */   
/*    */ 
/*    */   public void a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2)
/*    */   {
/* 49 */     double d = ad.a((paramInt1 + 8) / 200.0D, (paramInt2 + 8) / 200.0D);
/* 50 */     int i; int j; int k; int m; if (d < -0.8D) {
/* 51 */       this.ar.y = 15;
/* 52 */       this.ar.z = 5;
/*    */     } else {
/* 54 */       this.ar.y = 4;
/* 55 */       this.ar.z = 10;
/*    */       
/* 57 */       ae.a(2);
/* 58 */       for (i = 0; i < 7; i++) {
/* 59 */         j = paramInt1 + paramRandom.nextInt(16) + 8;
/* 60 */         k = paramInt2 + paramRandom.nextInt(16) + 8;
/* 61 */         m = paramRandom.nextInt(paramahb.f(j, k) + 32);
/* 62 */         ae.a(paramahb, paramRandom, j, m, k);
/*    */       }
/*    */     }
/* 65 */     if (this.aC) {
/* 66 */       ae.a(0);
/* 67 */       for (i = 0; i < 10; i++) {
/* 68 */         j = paramInt1 + paramRandom.nextInt(16) + 8;
/* 69 */         k = paramInt2 + paramRandom.nextInt(16) + 8;
/* 70 */         m = paramRandom.nextInt(paramahb.f(j, k) + 32);
/* 71 */         ae.a(paramahb, paramRandom, j, m, k);
/*    */       }
/*    */     }
/* 74 */     super.a(paramahb, paramRandom, paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */   protected ahu k()
/*    */   {
/* 79 */     aip localaip = new aip(this.ay + 128);
/* 80 */     localaip.a("Sunflower Plains");
/* 81 */     localaip.aC = true;
/* 82 */     localaip.b(9286496);
/* 83 */     localaip.ah = 14273354;
/* 84 */     return localaip;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */