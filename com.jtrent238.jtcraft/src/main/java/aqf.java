/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aqf
/*     */ {
/*     */   public static aqg a(dh paramdh)
/*     */   {
/*  13 */     int i = paramdh.f("xPos");
/*  14 */     int j = paramdh.f("zPos");
/*     */     
/*  16 */     aqg localaqg = new aqg(i, j);
/*  17 */     localaqg.g = paramdh.k("Blocks");
/*  18 */     localaqg.f = new aqa(paramdh.k("Data"), 7);
/*  19 */     localaqg.e = new aqa(paramdh.k("SkyLight"), 7);
/*  20 */     localaqg.d = new aqa(paramdh.k("BlockLight"), 7);
/*  21 */     localaqg.c = paramdh.k("HeightMap");
/*  22 */     localaqg.b = paramdh.n("TerrainPopulated");
/*  23 */     localaqg.h = paramdh.c("Entities", 10);
/*  24 */     localaqg.i = paramdh.c("TileEntities", 10);
/*  25 */     localaqg.j = paramdh.c("TileTicks", 10);
/*     */     
/*     */     try
/*     */     {
/*  29 */       localaqg.a = paramdh.g("LastUpdate");
/*     */     } catch (ClassCastException localClassCastException) {
/*  31 */       localaqg.a = paramdh.f("LastUpdate");
/*     */     }
/*     */     
/*  34 */     return localaqg;
/*     */   }
/*     */   
/*     */   public static void a(aqg paramaqg, dh paramdh, aib paramaib)
/*     */   {
/*  39 */     paramdh.a("xPos", paramaqg.k);
/*  40 */     paramdh.a("zPos", paramaqg.l);
/*  41 */     paramdh.a("LastUpdate", paramaqg.a);
/*  42 */     int[] arrayOfInt = new int[paramaqg.c.length];
/*  43 */     for (int i = 0; i < paramaqg.c.length; i++) {
/*  44 */       arrayOfInt[i] = paramaqg.c[i];
/*     */     }
/*  46 */     paramdh.a("HeightMap", arrayOfInt);
/*  47 */     paramdh.a("TerrainPopulated", paramaqg.b);
/*     */     
/*  49 */     dq localdq = new dq();
/*  50 */     for (int j = 0; j < 8; j++)
/*     */     {
/*     */ 
/*  53 */       k = 1;
/*  54 */       int i4; for (int m = 0; (m < 16) && (k != 0); m++) {
/*  55 */         for (int i1 = 0; (i1 < 16) && (k != 0); i1++) {
/*  56 */           for (int i2 = 0; i2 < 16; i2++) {
/*  57 */             int i3 = m << 11 | i2 << 7 | i1 + (j << 4);
/*  58 */             i4 = paramaqg.g[i3];
/*  59 */             if (i4 != 0) {
/*  60 */               k = 0;
/*  61 */               break;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*  67 */       if (k == 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  72 */         byte[] arrayOfByte2 = new byte['က'];
/*  73 */         apv localapv1 = new apv(arrayOfByte2.length, 4);
/*  74 */         apv localapv2 = new apv(arrayOfByte2.length, 4);
/*  75 */         apv localapv3 = new apv(arrayOfByte2.length, 4);
/*     */         
/*  77 */         for (i4 = 0; i4 < 16; i4++) {
/*  78 */           for (int i5 = 0; i5 < 16; i5++) {
/*  79 */             for (int i6 = 0; i6 < 16; i6++) {
/*  80 */               int i7 = i4 << 11 | i6 << 7 | i5 + (j << 4);
/*  81 */               int i8 = paramaqg.g[i7];
/*     */               
/*  83 */               arrayOfByte2[(i5 << 8 | i6 << 4 | i4)] = ((byte)(i8 & 0xFF));
/*  84 */               localapv1.a(i4, i5, i6, paramaqg.f.a(i4, i5 + (j << 4), i6));
/*  85 */               localapv2.a(i4, i5, i6, paramaqg.e.a(i4, i5 + (j << 4), i6));
/*  86 */               localapv3.a(i4, i5, i6, paramaqg.d.a(i4, i5 + (j << 4), i6));
/*     */             }
/*     */           }
/*     */         }
/*     */         
/*  91 */         dh localdh = new dh();
/*     */         
/*  93 */         localdh.a("Y", (byte)(j & 0xFF));
/*  94 */         localdh.a("Blocks", arrayOfByte2);
/*  95 */         localdh.a("Data", localapv1.a);
/*  96 */         localdh.a("SkyLight", localapv2.a);
/*  97 */         localdh.a("BlockLight", localapv3.a);
/*     */         
/*  99 */         localdq.a(localdh);
/*     */       } }
/* 101 */     paramdh.a("Sections", localdq);
/*     */     
/*     */ 
/* 104 */     byte[] arrayOfByte1 = new byte['Ā'];
/* 105 */     for (int k = 0; k < 16; k++) {
/* 106 */       for (int n = 0; n < 16; n++) {
/* 107 */         arrayOfByte1[(n << 4 | k)] = ((byte)(paramaib.a(paramaqg.k << 4 | k, paramaqg.l << 4 | n).ay & 0xFF));
/*     */       }
/*     */     }
/* 110 */     paramdh.a("Biomes", arrayOfByte1);
/* 111 */     paramdh.a("Entities", paramaqg.h);
/* 112 */     paramdh.a("TileEntities", paramaqg.i);
/* 113 */     if (paramaqg.j != null) {
/* 114 */       paramdh.a("TileTicks", paramaqg.j);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aqf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */