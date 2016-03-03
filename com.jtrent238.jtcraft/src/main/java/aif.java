/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aif
/*     */   extends ahu
/*     */ {
/*     */   private int aF;
/*  20 */   protected static final are aC = new are(false, true);
/*  21 */   protected static final are aD = new are(false, false);
/*  22 */   protected static final asi aE = new asi(false);
/*     */   
/*     */   public aif(int paramInt1, int paramInt2) {
/*  25 */     super(paramInt1);
/*  26 */     this.aF = paramInt2;
/*  27 */     this.ar.x = 10;
/*  28 */     this.ar.z = 2;
/*     */     
/*  30 */     if (this.aF == 1) {
/*  31 */       this.ar.x = 6;
/*  32 */       this.ar.y = 100;
/*  33 */       this.ar.z = 1;
/*     */     }
/*  35 */     a(5159473);
/*  36 */     a(0.7F, 0.8F);
/*     */     
/*  38 */     if (this.aF == 2) {
/*  39 */       this.ah = 353825;
/*  40 */       this.ag = 3175492;
/*  41 */       a(0.6F, 0.6F);
/*     */     }
/*     */     
/*  44 */     if (this.aF == 0) {
/*  45 */       this.at.add(new ahx(wv.class, 5, 4, 4));
/*     */     }
/*     */     
/*  48 */     if (this.aF == 3) {
/*  49 */       this.ar.x = 64537;
/*     */     }
/*     */   }
/*     */   
/*     */   protected ahu a(int paramInt, boolean paramBoolean)
/*     */   {
/*  55 */     if (this.aF == 2) {
/*  56 */       this.ah = 353825;
/*  57 */       this.ag = paramInt;
/*     */       
/*  59 */       if (paramBoolean) {
/*  60 */         this.ah = ((this.ah & 0xFEFEFE) >> 1);
/*     */       }
/*  62 */       return this;
/*     */     }
/*  64 */     return super.a(paramInt, paramBoolean);
/*     */   }
/*     */   
/*     */ 
/*     */   public arc a(Random paramRandom)
/*     */   {
/*  70 */     if ((this.aF == 3) && (paramRandom.nextInt(3) > 0)) {
/*  71 */       return aE;
/*     */     }
/*  73 */     if ((this.aF == 2) || (paramRandom.nextInt(5) == 0)) {
/*  74 */       return aD;
/*     */     }
/*  76 */     return this.az;
/*     */   }
/*     */   
/*     */   public String a(Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  81 */     if (this.aF == 1) {
/*  82 */       double d = qh.a((1.0D + ad.a(paramInt1 / 48.0D, paramInt3 / 48.0D)) / 2.0D, 0.0D, 0.9999D);
/*  83 */       int i = (int)(d * alc.a.length);
/*  84 */       if (i == 1) {
/*  85 */         i = 0;
/*     */       }
/*  87 */       return alc.a[i];
/*     */     }
/*  89 */     return super.a(paramRandom, paramInt1, paramInt2, paramInt3); }
/*     */   
/*     */   public void a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2) { int k;
/*     */     int m;
/*     */     int n;
/*  94 */     if (this.aF == 3) {
/*  95 */       for (i = 0; i < 4; i++) {
/*  96 */         for (j = 0; j < 4; j++) {
/*  97 */           k = paramInt1 + i * 4 + 1 + 8 + paramRandom.nextInt(3);
/*  98 */           m = paramInt2 + j * 4 + 1 + 8 + paramRandom.nextInt(3);
/*  99 */           n = paramahb.f(k, m);
/*     */           Object localObject;
/* 101 */           if (paramRandom.nextInt(20) == 0) {
/* 102 */             localObject = new aru();
/* 103 */             ((aru)localObject).a(paramahb, paramRandom, k, n, m);
/*     */           } else {
/* 105 */             localObject = a(paramRandom);
/* 106 */             ((arc)localObject).a(1.0D, 1.0D, 1.0D);
/* 107 */             if (((arc)localObject).a(paramahb, paramRandom, k, n, m)) {
/* 108 */               ((arc)localObject).b(paramahb, paramRandom, k, n, m);
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/* 114 */     int i = paramRandom.nextInt(5) - 3;
/* 115 */     if (this.aF == 1) {
/* 116 */       i += 2;
/*     */     }
/* 118 */     for (int j = 0; j < i; j++) {
/* 119 */       k = paramRandom.nextInt(3);
/* 120 */       if (k == 0) {
/* 121 */         ae.a(1);
/* 122 */       } else if (k == 1) {
/* 123 */         ae.a(4);
/* 124 */       } else if (k == 2) {
/* 125 */         ae.a(5);
/*     */       }
/*     */       
/* 128 */       for (m = 0; m < 5; m++) {
/* 129 */         n = paramInt1 + paramRandom.nextInt(16) + 8;
/* 130 */         int i1 = paramInt2 + paramRandom.nextInt(16) + 8;
/* 131 */         int i2 = paramRandom.nextInt(paramahb.f(n, i1) + 32);
/* 132 */         if (ae.a(paramahb, paramRandom, n, i2, i1)) {
/*     */           break;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 138 */     super.a(paramahb, paramRandom, paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public int b(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 143 */     int i = super.b(paramInt1, paramInt2, paramInt3);
/*     */     
/* 145 */     if (this.aF == 3) {
/* 146 */       return (i & 0xFEFEFE) + 2634762 >> 1;
/*     */     }
/*     */     
/* 149 */     return i;
/*     */   }
/*     */   
/*     */   protected ahu k()
/*     */   {
/* 154 */     if (this.ay == ahu.s.ay) {
/* 155 */       aif localaif = new aif(this.ay + 128, 1);
/* 156 */       localaif.a(new ahv(this.am, this.an + 0.2F));
/* 157 */       localaif.a("Flower Forest");
/* 158 */       localaif.a(6976549, true);
/* 159 */       localaif.a(8233509);
/* 160 */       return localaif;
/*     */     }
/* 162 */     if ((this.ay == ahu.P.ay) || (this.ay == ahu.Q.ay)) {
/* 163 */       return new aig(this, this.ay + 128, this);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 173 */     return new aih(this, this.ay + 128, this);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aif.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */