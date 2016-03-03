/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aeu
/*     */   implements afg
/*     */ {
/*     */   public boolean a(aae paramaae, ahb paramahb)
/*     */   {
/*  14 */     Object localObject = null;
/*  15 */     ArrayList localArrayList = new ArrayList();
/*     */     
/*  17 */     for (int i = 0; i < paramaae.a(); i++) {
/*  18 */       add localadd = paramaae.a(i);
/*  19 */       if (localadd != null)
/*     */       {
/*  21 */         if ((localadd.b() instanceof abb)) {
/*  22 */           abb localabb = (abb)localadd.b();
/*     */           
/*  24 */           if ((localabb.m_() == abd.a) && (localObject == null)) {
/*  25 */             localObject = localadd;
/*     */           } else {
/*  27 */             return false;
/*     */           }
/*  29 */         } else if (localadd.b() == ade.aR) {
/*  30 */           localArrayList.add(localadd);
/*     */         } else {
/*  32 */           return false;
/*     */         }
/*     */       }
/*     */     }
/*  36 */     return (localObject != null) && (!localArrayList.isEmpty());
/*     */   }
/*     */   
/*     */   public add a(aae paramaae)
/*     */   {
/*  41 */     add localadd1 = null;
/*  42 */     int[] arrayOfInt = new int[3];
/*  43 */     int i = 0;
/*  44 */     int j = 0;
/*  45 */     abb localabb = null;
/*     */     
/*  47 */     for (int k = 0; k < paramaae.a(); k++) {
/*  48 */       add localadd2 = paramaae.a(k);
/*  49 */       if (localadd2 != null)
/*     */       {
/*  51 */         if ((localadd2.b() instanceof abb)) {
/*  52 */           localabb = (abb)localadd2.b();
/*     */           
/*  54 */           if ((localabb.m_() == abd.a) && (localadd1 == null)) {
/*  55 */             localadd1 = localadd2.m();
/*  56 */             localadd1.b = 1;
/*     */             
/*  58 */             if (localabb.c_(localadd2)) {
/*  59 */               int n = localabb.b(localadd1);
/*  60 */               float f1 = (n >> 16 & 0xFF) / 255.0F;
/*  61 */               float f3 = (n >> 8 & 0xFF) / 255.0F;
/*  62 */               float f5 = (n & 0xFF) / 255.0F;
/*     */               
/*  64 */               i = (int)(i + Math.max(f1, Math.max(f3, f5)) * 255.0F); int 
/*     */               
/*  66 */                 tmp174_173 = 0; int[] tmp174_172 = arrayOfInt;tmp174_172[tmp174_173] = ((int)(tmp174_172[tmp174_173] + f1 * 255.0F)); int 
/*  67 */                 tmp187_186 = 1; int[] tmp187_185 = arrayOfInt;tmp187_185[tmp187_186] = ((int)(tmp187_185[tmp187_186] + f3 * 255.0F)); int 
/*  68 */                 tmp200_199 = 2; int[] tmp200_198 = arrayOfInt;tmp200_198[tmp200_199] = ((int)(tmp200_198[tmp200_199] + f5 * 255.0F));
/*  69 */               j++;
/*     */             }
/*     */           } else {
/*  72 */             return null;
/*     */           }
/*  74 */         } else if (localadd2.b() == ade.aR) {
/*  75 */           float[] arrayOfFloat = wp.bp[aka.b(localadd2.k())];
/*  76 */           int i2 = (int)(arrayOfFloat[0] * 255.0F);
/*  77 */           int i3 = (int)(arrayOfFloat[1] * 255.0F);
/*  78 */           i4 = (int)(arrayOfFloat[2] * 255.0F);
/*     */           
/*  80 */           i += Math.max(i2, Math.max(i3, i4));
/*     */           
/*  82 */           arrayOfInt[0] += i2;
/*  83 */           arrayOfInt[1] += i3;
/*  84 */           arrayOfInt[2] += i4;
/*  85 */           j++;
/*     */         } else {
/*  87 */           return null;
/*     */         }
/*     */       }
/*     */     }
/*  91 */     if (localabb == null) { return null;
/*     */     }
/*  93 */     k = arrayOfInt[0] / j;
/*  94 */     int m = arrayOfInt[1] / j;
/*  95 */     int i1 = arrayOfInt[2] / j;
/*     */     
/*  97 */     float f2 = i / j;
/*  98 */     float f4 = Math.max(k, Math.max(m, i1));
/*     */     
/* 100 */     k = (int)(k * f2 / f4);
/* 101 */     m = (int)(m * f2 / f4);
/* 102 */     i1 = (int)(i1 * f2 / f4);
/*     */     
/* 104 */     int i4 = k;
/* 105 */     i4 = (i4 << 8) + m;
/* 106 */     i4 = (i4 << 8) + i1;
/*     */     
/* 108 */     localabb.b(localadd1, i4);
/* 109 */     return localadd1;
/*     */   }
/*     */   
/*     */   public int a()
/*     */   {
/* 114 */     return 10;
/*     */   }
/*     */   
/*     */   public add b()
/*     */   {
/* 119 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aeu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */