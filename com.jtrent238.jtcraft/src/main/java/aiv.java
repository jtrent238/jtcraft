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
/*    */ public class aiv
/*    */   extends ahu
/*    */ {
/*    */   protected aiv(int paramInt)
/*    */   {
/* 18 */     super(paramInt);
/* 19 */     this.ar.x = 2;
/* 20 */     this.ar.y = 1;
/* 21 */     this.ar.A = 1;
/* 22 */     this.ar.B = 8;
/* 23 */     this.ar.C = 10;
/* 24 */     this.ar.G = 1;
/* 25 */     this.ar.w = 4;
/* 26 */     this.ar.F = 0;
/* 27 */     this.ar.E = 0;
/* 28 */     this.ar.z = 5;
/*    */     
/* 30 */     this.aq = 14745518;
/*    */     
/* 32 */     this.as.add(new ahx(ym.class, 1, 1, 1));
/*    */   }
/*    */   
/*    */   public arc a(Random paramRandom)
/*    */   {
/* 37 */     return this.aB;
/*    */   }
/*    */   
/*    */ 
/*    */   public int b(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 43 */     double d = ad.a(paramInt1 * 0.0225D, paramInt3 * 0.0225D);
/* 44 */     if (d < -0.1D) {
/* 45 */       return 5011004;
/*    */     }
/* 47 */     return 6975545;
/*    */   }
/*    */   
/*    */   public int c(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 52 */     return 6975545;
/*    */   }
/*    */   
/*    */   public String a(Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 57 */     return alc.a[1];
/*    */   }
/*    */   
/*    */   public void a(ahb paramahb, Random paramRandom, aji[] paramArrayOfaji, byte[] paramArrayOfByte, int paramInt1, int paramInt2, double paramDouble)
/*    */   {
/* 62 */     double d = ad.a(paramInt1 * 0.25D, paramInt2 * 0.25D);
/* 63 */     if (d > 0.0D) {
/* 64 */       int i = paramInt1 & 0xF;
/* 65 */       int j = paramInt2 & 0xF;
/* 66 */       int k = paramArrayOfaji.length / 256;
/* 67 */       for (int m = 255; m >= 0; m--) {
/* 68 */         int n = (j * 16 + i) * k + m;
/* 69 */         if ((paramArrayOfaji[n] == null) || (paramArrayOfaji[n].o() != awt.a)) {
/* 70 */           if ((m != 62) || (paramArrayOfaji[n] == ajn.j)) break;
/* 71 */           paramArrayOfaji[n] = ajn.j;
/* 72 */           if (d >= 0.12D) break;
/* 73 */           paramArrayOfaji[(n + 1)] = ajn.bi; break;
/*    */         }
/*    */       }
/*    */     }
/*    */     
/*    */ 
/*    */ 
/*    */ 
/* 81 */     b(paramahb, paramRandom, paramArrayOfaji, paramArrayOfByte, paramInt1, paramInt2, paramDouble);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aiv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */