/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class avp
/*     */ {
/*     */   public static void a()
/*     */   {
/*  27 */     avi.a(avq.class, "ViBH");
/*  28 */     avi.a(avr.class, "ViDF");
/*  29 */     avi.a(avs.class, "ViF");
/*  30 */     avi.a(avt.class, "ViL");
/*  31 */     avi.a(avv.class, "ViPH");
/*  32 */     avi.a(avw.class, "ViSH");
/*  33 */     avi.a(avx.class, "ViSmH");
/*  34 */     avi.a(avy.class, "ViST");
/*  35 */     avi.a(avz.class, "ViS");
/*  36 */     avi.a(awa.class, "ViStart");
/*  37 */     avi.a(awb.class, "ViSR");
/*  38 */     avi.a(awc.class, "ViTRH");
/*  39 */     avi.a(awf.class, "ViW");
/*     */   }
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
/*     */ 
/*     */ 
/*     */   public static List a(Random paramRandom, int paramInt)
/*     */   {
/*  64 */     ArrayList localArrayList = new ArrayList();
/*     */     
/*  66 */     localArrayList.add(new avu(avw.class, 4, qh.a(paramRandom, 2 + paramInt, 4 + paramInt * 2)));
/*  67 */     localArrayList.add(new avu(avy.class, 20, qh.a(paramRandom, 0 + paramInt, 1 + paramInt)));
/*  68 */     localArrayList.add(new avu(avq.class, 20, qh.a(paramRandom, 0 + paramInt, 2 + paramInt)));
/*  69 */     localArrayList.add(new avu(avx.class, 3, qh.a(paramRandom, 2 + paramInt, 5 + paramInt * 3)));
/*  70 */     localArrayList.add(new avu(avv.class, 15, qh.a(paramRandom, 0 + paramInt, 2 + paramInt)));
/*  71 */     localArrayList.add(new avu(avr.class, 3, qh.a(paramRandom, 1 + paramInt, 4 + paramInt)));
/*  72 */     localArrayList.add(new avu(avs.class, 3, qh.a(paramRandom, 2 + paramInt, 4 + paramInt * 2)));
/*  73 */     localArrayList.add(new avu(avz.class, 15, qh.a(paramRandom, 0, 1 + paramInt)));
/*  74 */     localArrayList.add(new avu(awc.class, 8, qh.a(paramRandom, 0 + paramInt, 3 + paramInt * 2)));
/*     */     
/*     */ 
/*  77 */     Iterator localIterator = localArrayList.iterator();
/*  78 */     while (localIterator.hasNext()) {
/*  79 */       if (((avu)localIterator.next()).d == 0) {
/*  80 */         localIterator.remove();
/*     */       }
/*     */     }
/*     */     
/*  84 */     return localArrayList;
/*     */   }
/*     */   
/*     */   private static int a(List paramList) {
/*  88 */     int i = 0;
/*  89 */     int j = 0;
/*  90 */     for (avu localavu : paramList) {
/*  91 */       if ((localavu.d > 0) && (localavu.c < localavu.d)) {
/*  92 */         i = 1;
/*     */       }
/*  94 */       j += localavu.b;
/*     */     }
/*  96 */     return i != 0 ? j : -1;
/*     */   }
/*     */   
/*     */ 
/*     */   private static awd a(awa paramawa, avu paramavu, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/* 102 */     Class localClass = paramavu.a;
/* 103 */     Object localObject = null;
/*     */     
/* 105 */     if (localClass == avw.class) {
/* 106 */       localObject = avw.a(paramawa, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 107 */     } else if (localClass == avy.class) {
/* 108 */       localObject = avy.a(paramawa, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 109 */     } else if (localClass == avq.class) {
/* 110 */       localObject = avq.a(paramawa, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 111 */     } else if (localClass == avx.class) {
/* 112 */       localObject = avx.a(paramawa, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 113 */     } else if (localClass == avv.class) {
/* 114 */       localObject = avv.a(paramawa, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 115 */     } else if (localClass == avr.class) {
/* 116 */       localObject = avr.a(paramawa, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 117 */     } else if (localClass == avs.class) {
/* 118 */       localObject = avs.a(paramawa, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 119 */     } else if (localClass == avz.class) {
/* 120 */       localObject = avz.a(paramawa, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 121 */     } else if (localClass == awc.class) {
/* 122 */       localObject = awc.a(paramawa, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*     */     }
/*     */     
/* 125 */     return (awd)localObject;
/*     */   }
/*     */   
/*     */   private static awd c(awa paramawa, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/* 130 */     int i = a(paramawa.e);
/* 131 */     if (i <= 0) {
/* 132 */       return null;
/*     */     }
/*     */     
/* 135 */     int j = 0;
/* 136 */     int k; while (j < 5) {
/* 137 */       j++;
/*     */       
/* 139 */       k = paramRandom.nextInt(i);
/* 140 */       for (avu localavu : paramawa.e) {
/* 141 */         k -= localavu.b;
/* 142 */         if (k < 0)
/*     */         {
/* 144 */           if ((!localavu.a(paramInt5)) || ((localavu == paramawa.d) && (paramawa.e.size() > 1))) {
/*     */             break;
/*     */           }
/*     */           
/* 148 */           awd localawd = a(paramawa, localavu, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 149 */           if (localawd != null) {
/* 150 */             localavu.c += 1;
/* 151 */             paramawa.d = localavu;
/*     */             
/* 153 */             if (!localavu.a()) {
/* 154 */               paramawa.e.remove(localavu);
/*     */             }
/* 156 */             return localawd;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 164 */     asv localasv = avt.a(paramawa, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4);
/* 165 */     if (localasv != null) {
/* 166 */       return new avt(paramawa, paramInt5, paramRandom, localasv, paramInt4);
/*     */     }
/*     */     
/* 169 */     return null;
/*     */   }
/*     */   
/*     */   private static avk d(awa paramawa, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/* 173 */     if (paramInt5 > 50) {
/* 174 */       return null;
/*     */     }
/* 176 */     if ((Math.abs(paramInt1 - paramawa.c().a) > 112) || (Math.abs(paramInt3 - paramawa.c().c) > 112)) {
/* 177 */       return null;
/*     */     }
/*     */     
/* 180 */     awd localawd = c(paramawa, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5 + 1);
/* 181 */     if (localawd != null) {
/* 182 */       int i = (localawd.f.a + localawd.f.d) / 2;
/* 183 */       int j = (localawd.f.c + localawd.f.f) / 2;
/* 184 */       int k = localawd.f.d - localawd.f.a;
/* 185 */       int m = localawd.f.f - localawd.f.c;
/* 186 */       int n = k > m ? k : m;
/* 187 */       if (paramawa.e().a(i, j, n / 2 + 4, avn.e)) {
/* 188 */         paramList.add(localawd);
/* 189 */         paramawa.i.add(localawd);
/* 190 */         return localawd;
/*     */       }
/*     */     }
/* 193 */     return null;
/*     */   }
/*     */   
/*     */   private static avk e(awa paramawa, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/* 197 */     if (paramInt5 > 3 + paramawa.c) {
/* 198 */       return null;
/*     */     }
/* 200 */     if ((Math.abs(paramInt1 - paramawa.c().a) > 112) || (Math.abs(paramInt3 - paramawa.c().c) > 112)) {
/* 201 */       return null;
/*     */     }
/*     */     
/* 204 */     asv localasv = awb.a(paramawa, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4);
/* 205 */     if ((localasv != null) && (localasv.b > 10)) {
/* 206 */       awb localawb = new awb(paramawa, paramInt5, paramRandom, localasv, paramInt4);
/* 207 */       int i = (localawb.f.a + localawb.f.d) / 2;
/* 208 */       int j = (localawb.f.c + localawb.f.f) / 2;
/* 209 */       int k = localawb.f.d - localawb.f.a;
/* 210 */       int m = localawb.f.f - localawb.f.c;
/* 211 */       int n = k > m ? k : m;
/* 212 */       if (paramawa.e().a(i, j, n / 2 + 4, avn.e)) {
/* 213 */         paramList.add(localawb);
/* 214 */         paramawa.j.add(localawb);
/* 215 */         return localawb;
/*     */       }
/*     */     }
/*     */     
/* 219 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\avp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */