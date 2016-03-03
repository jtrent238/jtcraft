/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aiw
/*     */   extends ahu
/*     */ {
/*  12 */   private static final asf aC = new asf();
/*  13 */   private static final asn aD = new asn(false);
/*  14 */   private static final asa aE = new asa(false, false);
/*  15 */   private static final asa aF = new asa(false, true);
/*  16 */   private static final arf aG = new arf(ajn.Y, 0);
/*     */   
/*     */ 
/*     */   private int aH;
/*     */   
/*     */ 
/*     */ 
/*     */   public aiw(int paramInt1, int paramInt2)
/*     */   {
/*  25 */     super(paramInt1);
/*  26 */     this.aH = paramInt2;
/*     */     
/*  28 */     this.at.add(new ahx(wv.class, 8, 4, 4));
/*     */     
/*  30 */     this.ar.x = 10;
/*  31 */     if ((paramInt2 == 1) || (paramInt2 == 2)) {
/*  32 */       this.ar.z = 7;
/*  33 */       this.ar.A = 1;
/*  34 */       this.ar.B = 3;
/*     */     } else {
/*  36 */       this.ar.z = 1;
/*  37 */       this.ar.B = 1;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public arc a(Random paramRandom)
/*     */   {
/*  44 */     if (((this.aH == 1) || (this.aH == 2)) && (paramRandom.nextInt(3) == 0)) {
/*  45 */       if ((this.aH == 2) || (paramRandom.nextInt(13) == 0)) {
/*  46 */         return aF;
/*     */       }
/*  48 */       return aE;
/*     */     }
/*  50 */     if (paramRandom.nextInt(3) == 0) {
/*  51 */       return aC;
/*     */     }
/*  53 */     return aD;
/*     */   }
/*     */   
/*     */   public arn b(Random paramRandom)
/*     */   {
/*  58 */     if (paramRandom.nextInt(5) > 0) {
/*  59 */       return new asp(ajn.H, 2);
/*     */     }
/*  61 */     return new asp(ajn.H, 1); }
/*     */   
/*     */   public void a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2) { int j;
/*     */     int k;
/*     */     int m;
/*  66 */     if ((this.aH == 1) || (this.aH == 2)) {
/*  67 */       i = paramRandom.nextInt(3);
/*  68 */       for (j = 0; j < i; j++) {
/*  69 */         k = paramInt1 + paramRandom.nextInt(16) + 8;
/*  70 */         m = paramInt2 + paramRandom.nextInt(16) + 8;
/*  71 */         int n = paramahb.f(k, m);
/*  72 */         aG.a(paramahb, paramRandom, k, n, m);
/*     */       }
/*     */     }
/*     */     
/*  76 */     ae.a(3);
/*  77 */     for (int i = 0; i < 7; i++) {
/*  78 */       j = paramInt1 + paramRandom.nextInt(16) + 8;
/*  79 */       k = paramInt2 + paramRandom.nextInt(16) + 8;
/*  80 */       m = paramRandom.nextInt(paramahb.f(j, k) + 32);
/*  81 */       ae.a(paramahb, paramRandom, j, m, k);
/*     */     }
/*     */     
/*  84 */     super.a(paramahb, paramRandom, paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, Random paramRandom, aji[] paramArrayOfaji, byte[] paramArrayOfByte, int paramInt1, int paramInt2, double paramDouble)
/*     */   {
/*  89 */     if ((this.aH == 1) || (this.aH == 2)) {
/*  90 */       this.ai = ajn.c;
/*  91 */       this.aj = 0;
/*  92 */       this.ak = ajn.d;
/*  93 */       if (paramDouble > 1.75D) {
/*  94 */         this.ai = ajn.d;
/*  95 */         this.aj = 1;
/*  96 */       } else if (paramDouble > -0.95D) {
/*  97 */         this.ai = ajn.d;
/*  98 */         this.aj = 2;
/*     */       }
/*     */     }
/* 101 */     b(paramahb, paramRandom, paramArrayOfaji, paramArrayOfByte, paramInt1, paramInt2, paramDouble);
/*     */   }
/*     */   
/*     */   protected ahu k()
/*     */   {
/* 106 */     if (this.ay == ahu.U.ay) {
/* 107 */       return new aiw(this.ay + 128, 2).a(5858897, true).a("Mega Spruce Taiga").a(5159473).a(0.25F, 0.8F).a(new ahv(this.am, this.an));
/*     */     }
/* 109 */     return super.k();
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aiw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */