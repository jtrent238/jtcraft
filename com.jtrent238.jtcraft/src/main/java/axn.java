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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class axn
/*     */ {
/*     */   private long c;
/*     */   protected axn a;
/*     */   private long d;
/*     */   protected long b;
/*     */   
/*     */   public static axn[] a(long paramLong, ahm paramahm)
/*     */   {
/*  29 */     int i = 0;
/*     */     
/*  31 */     Object localObject1 = new axm(1L);
/*  32 */     localObject1 = new axj(2000L, (axn)localObject1);
/*  33 */     localObject1 = new axb(1L, (axn)localObject1);
/*  34 */     localObject1 = new ayc(2001L, (axn)localObject1);
/*  35 */     localObject1 = new axb(2L, (axn)localObject1);
/*  36 */     localObject1 = new axb(50L, (axn)localObject1);
/*  37 */     localObject1 = new axb(70L, (axn)localObject1);
/*  38 */     localObject1 = new axs(2L, (axn)localObject1);
/*  39 */     localObject1 = new axd(2L, (axn)localObject1);
/*  40 */     localObject1 = new axb(3L, (axn)localObject1);
/*  41 */     localObject1 = new awy(2L, (axn)localObject1, axa.a);
/*  42 */     localObject1 = new awy(2L, (axn)localObject1, axa.b);
/*  43 */     localObject1 = new awy(3L, (axn)localObject1, axa.c);
/*  44 */     localObject1 = new ayc(2002L, (axn)localObject1);
/*  45 */     localObject1 = new ayc(2003L, (axn)localObject1);
/*  46 */     localObject1 = new axb(4L, (axn)localObject1);
/*  47 */     localObject1 = new axc(5L, (axn)localObject1);
/*  48 */     localObject1 = new awx(4L, (axn)localObject1);
/*  49 */     localObject1 = ayc.b(1000L, (axn)localObject1, 0);
/*     */     
/*     */ 
/*     */ 
/*  53 */     int j = 4;
/*  54 */     if (paramahm == ahm.d) {
/*  55 */       j = 6;
/*     */     }
/*  57 */     if (i != 0) {
/*  58 */       j = 4;
/*     */     }
/*     */     
/*  61 */     Object localObject2 = localObject1;
/*  62 */     localObject2 = ayc.b(1000L, (axn)localObject2, 0);
/*  63 */     localObject2 = new axt(100L, (axn)localObject2);
/*     */     
/*  65 */     Object localObject3 = localObject1;
/*  66 */     localObject3 = new axf(200L, (axn)localObject3, paramahm);
/*  67 */     if (i == 0) {
/*  68 */       localObject3 = ayc.b(1000L, (axn)localObject3, 2);
/*  69 */       localObject3 = new axe(1000L, (axn)localObject3);
/*     */     }
/*  71 */     Object localObject4 = localObject2;
/*  72 */     localObject4 = ayc.b(1000L, (axn)localObject4, 2);
/*  73 */     localObject3 = new axr(1000L, (axn)localObject3, (axn)localObject4);
/*     */     
/*  75 */     localObject2 = ayc.b(1000L, (axn)localObject2, 2);
/*  76 */     localObject2 = ayc.b(1000L, (axn)localObject2, j);
/*  77 */     localObject2 = new axu(1L, (axn)localObject2);
/*  78 */     localObject2 = new axx(1000L, (axn)localObject2);
/*     */     
/*  80 */     localObject3 = new axq(1001L, (axn)localObject3);
/*  81 */     for (int k = 0; k < j; k++) {
/*  82 */       localObject3 = new ayc(1000 + k, (axn)localObject3);
/*  83 */       if (k == 0) {
/*  84 */         localObject3 = new axb(3L, (axn)localObject3);
/*     */       }
/*     */       
/*  87 */       if (k == 1) {
/*  88 */         localObject3 = new axw(1000L, (axn)localObject3);
/*     */       }
/*     */     }
/*     */     
/*  92 */     localObject3 = new axx(1000L, (axn)localObject3);
/*     */     
/*  94 */     localObject3 = new axv(100L, (axn)localObject3, (axn)localObject2);
/*     */     
/*  96 */     Object localObject5 = localObject3;
/*  97 */     ayb localayb = new ayb(10L, (axn)localObject3);
/*     */     
/*  99 */     ((axn)localObject3).a(paramLong);
/* 100 */     localayb.a(paramLong);
/*     */     
/* 102 */     return new axn[] { localObject3, localayb, localObject5 };
/*     */   }
/*     */   
/*     */ 
/*     */   public axn(long paramLong)
/*     */   {
/* 108 */     this.b = paramLong;
/* 109 */     this.b *= (this.b * 6364136223846793005L + 1442695040888963407L);
/* 110 */     this.b += paramLong;
/* 111 */     this.b *= (this.b * 6364136223846793005L + 1442695040888963407L);
/* 112 */     this.b += paramLong;
/* 113 */     this.b *= (this.b * 6364136223846793005L + 1442695040888963407L);
/* 114 */     this.b += paramLong;
/*     */   }
/*     */   
/*     */   public void a(long paramLong) {
/* 118 */     this.c = paramLong;
/* 119 */     if (this.a != null) this.a.a(paramLong);
/* 120 */     this.c *= (this.c * 6364136223846793005L + 1442695040888963407L);
/* 121 */     this.c += this.b;
/* 122 */     this.c *= (this.c * 6364136223846793005L + 1442695040888963407L);
/* 123 */     this.c += this.b;
/* 124 */     this.c *= (this.c * 6364136223846793005L + 1442695040888963407L);
/* 125 */     this.c += this.b;
/*     */   }
/*     */   
/*     */   public void a(long paramLong1, long paramLong2) {
/* 129 */     this.d = this.c;
/* 130 */     this.d *= (this.d * 6364136223846793005L + 1442695040888963407L);
/* 131 */     this.d += paramLong1;
/* 132 */     this.d *= (this.d * 6364136223846793005L + 1442695040888963407L);
/* 133 */     this.d += paramLong2;
/* 134 */     this.d *= (this.d * 6364136223846793005L + 1442695040888963407L);
/* 135 */     this.d += paramLong1;
/* 136 */     this.d *= (this.d * 6364136223846793005L + 1442695040888963407L);
/* 137 */     this.d += paramLong2;
/*     */   }
/*     */   
/*     */   protected int a(int paramInt) {
/* 141 */     int i = (int)((this.d >> 24) % paramInt);
/* 142 */     if (i < 0) i += paramInt;
/* 143 */     this.d *= (this.d * 6364136223846793005L + 1442695040888963407L);
/* 144 */     this.d += this.c;
/* 145 */     return i;
/*     */   }
/*     */   
/*     */   public abstract int[] a(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*     */   
/*     */   protected static boolean a(int paramInt1, int paramInt2) {
/* 151 */     if (paramInt1 == paramInt2) {
/* 152 */       return true;
/*     */     }
/* 154 */     if ((paramInt1 == ahu.aa.ay) || (paramInt1 == ahu.ab.ay)) {
/* 155 */       return (paramInt2 == ahu.aa.ay) || (paramInt2 == ahu.ab.ay);
/*     */     }
/*     */     try
/*     */     {
/* 159 */       if ((ahu.d(paramInt1) != null) && (ahu.d(paramInt2) != null)) {
/* 160 */         return ahu.d(paramInt1).a(ahu.d(paramInt2));
/*     */       }
/*     */     } catch (Throwable localThrowable) {
/* 163 */       b localb = b.a(localThrowable, "Comparing biomes");
/* 164 */       k localk = localb.a("Biomes being compared");
/*     */       
/* 166 */       localk.a("Biome A ID", Integer.valueOf(paramInt1));
/* 167 */       localk.a("Biome B ID", Integer.valueOf(paramInt2));
/*     */       
/* 169 */       localk.a("Biome A", new axo(paramInt1));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 175 */       localk.a("Biome B", new axp(paramInt2));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 182 */       throw new s(localb);
/*     */     }
/*     */     
/* 185 */     return false;
/*     */   }
/*     */   
/*     */   protected static boolean b(int paramInt) {
/* 189 */     return (paramInt == ahu.o.ay) || (paramInt == ahu.M.ay) || (paramInt == ahu.y.ay);
/*     */   }
/*     */   
/*     */   protected int a(int... paramVarArgs) {
/* 193 */     return paramVarArgs[a(paramVarArgs.length)];
/*     */   }
/*     */   
/*     */   protected int b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 197 */     if ((paramInt2 == paramInt3) && (paramInt3 == paramInt4)) return paramInt2;
/* 198 */     if ((paramInt1 == paramInt2) && (paramInt1 == paramInt3)) return paramInt1;
/* 199 */     if ((paramInt1 == paramInt2) && (paramInt1 == paramInt4)) return paramInt1;
/* 200 */     if ((paramInt1 == paramInt3) && (paramInt1 == paramInt4)) { return paramInt1;
/*     */     }
/* 202 */     if ((paramInt1 == paramInt2) && (paramInt3 != paramInt4)) return paramInt1;
/* 203 */     if ((paramInt1 == paramInt3) && (paramInt2 != paramInt4)) return paramInt1;
/* 204 */     if ((paramInt1 == paramInt4) && (paramInt2 != paramInt3)) { return paramInt1;
/*     */     }
/*     */     
/* 207 */     if ((paramInt2 == paramInt3) && (paramInt1 != paramInt4)) return paramInt2;
/* 208 */     if ((paramInt2 == paramInt4) && (paramInt1 != paramInt3)) { return paramInt2;
/*     */     }
/*     */     
/*     */ 
/* 212 */     if ((paramInt3 == paramInt4) && (paramInt1 != paramInt2)) { return paramInt3;
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 218 */     return a(new int[] { paramInt1, paramInt2, paramInt3, paramInt4 });
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\axn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */