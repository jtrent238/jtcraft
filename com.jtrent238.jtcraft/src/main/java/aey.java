/*     */ import java.util.ArrayList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aey
/*     */   implements afg
/*     */ {
/*     */   private add a;
/*     */   
/*     */   public boolean a(aae paramaae, ahb paramahb)
/*     */   {
/*  17 */     this.a = null;
/*     */     
/*  19 */     int i = 0;
/*  20 */     int j = 0;
/*  21 */     int k = 0;
/*  22 */     int m = 0;
/*  23 */     int n = 0;
/*  24 */     int i1 = 0;
/*     */     Object localObject2;
/*  26 */     for (int i2 = 0; i2 < paramaae.a(); i2++) {
/*  27 */       localObject2 = paramaae.a(i2);
/*  28 */       if (localObject2 != null)
/*     */       {
/*  30 */         if (((add)localObject2).b() == ade.H) {
/*  31 */           j++;
/*  32 */         } else if (((add)localObject2).b() == ade.bQ) {
/*  33 */           m++;
/*  34 */         } else if (((add)localObject2).b() == ade.aR) {
/*  35 */           k++;
/*  36 */         } else if (((add)localObject2).b() == ade.aF) {
/*  37 */           i++;
/*  38 */         } else if (((add)localObject2).b() == ade.aO)
/*     */         {
/*  40 */           n++;
/*  41 */         } else if (((add)localObject2).b() == ade.i)
/*     */         {
/*  43 */           n++;
/*  44 */         } else if (((add)localObject2).b() == ade.bz)
/*     */         {
/*  46 */           i1++;
/*  47 */         } else if (((add)localObject2).b() == ade.G)
/*     */         {
/*  49 */           i1++;
/*  50 */         } else if (((add)localObject2).b() == ade.bl)
/*     */         {
/*  52 */           i1++;
/*  53 */         } else if (((add)localObject2).b() == ade.bL)
/*     */         {
/*  55 */           i1++;
/*     */         } else
/*  57 */           return false;
/*     */       }
/*     */     }
/*  60 */     n += k + i1;
/*     */     
/*  62 */     if ((j > 3) || (i > 1)) {
/*  63 */       return false;
/*     */     }
/*     */     
/*     */     Object localObject1;
/*  67 */     if ((j >= 1) && (i == 1) && (n == 0))
/*     */     {
/*  69 */       this.a = new add(ade.bP);
/*  70 */       if (m > 0) {
/*  71 */         localObject1 = new dh();
/*  72 */         localObject2 = new dh();
/*  73 */         dq localdq = new dq();
/*     */         
/*  75 */         for (int i5 = 0; i5 < paramaae.a(); i5++) {
/*  76 */           add localadd2 = paramaae.a(i5);
/*  77 */           if ((localadd2 != null) && (localadd2.b() == ade.bQ))
/*     */           {
/*  79 */             if ((localadd2.p()) && (localadd2.q().b("Explosion", 10))) {
/*  80 */               localdq.a(localadd2.q().m("Explosion"));
/*     */             }
/*     */           }
/*     */         }
/*  84 */         ((dh)localObject2).a("Explosions", localdq);
/*  85 */         ((dh)localObject2).a("Flight", (byte)j);
/*  86 */         ((dh)localObject1).a("Fireworks", (dy)localObject2);
/*  87 */         this.a.d((dh)localObject1);
/*     */       }
/*  89 */       return true;
/*     */     }
/*     */     
/*  92 */     if ((j == 1) && (i == 0) && (m == 0) && (k > 0) && (i1 <= 1))
/*     */     {
/*  94 */       this.a = new add(ade.bQ);
/*  95 */       localObject1 = new dh();
/*  96 */       localObject2 = new dh();
/*     */       
/*  98 */       byte b = 0;
/*     */       
/* 100 */       ArrayList localArrayList = new ArrayList();
/* 101 */       for (int i6 = 0; i6 < paramaae.a(); i6++) {
/* 102 */         add localadd3 = paramaae.a(i6);
/* 103 */         if (localadd3 != null)
/*     */         {
/* 105 */           if (localadd3.b() == ade.aR) {
/* 106 */             localArrayList.add(Integer.valueOf(acj.c[localadd3.k()]));
/* 107 */           } else if (localadd3.b() == ade.aO)
/*     */           {
/* 109 */             ((dh)localObject2).a("Flicker", true);
/* 110 */           } else if (localadd3.b() == ade.i)
/*     */           {
/* 112 */             ((dh)localObject2).a("Trail", true);
/* 113 */           } else if (localadd3.b() == ade.bz) {
/* 114 */             b = 1;
/* 115 */           } else if (localadd3.b() == ade.G) {
/* 116 */             b = 4;
/* 117 */           } else if (localadd3.b() == ade.bl) {
/* 118 */             b = 2;
/* 119 */           } else if (localadd3.b() == ade.bL)
/* 120 */             b = 3;
/*     */         }
/*     */       }
/* 123 */       int[] arrayOfInt2 = new int[localArrayList.size()];
/* 124 */       for (int i7 = 0; i7 < arrayOfInt2.length; i7++) {
/* 125 */         arrayOfInt2[i7] = ((Integer)localArrayList.get(i7)).intValue();
/*     */       }
/* 127 */       ((dh)localObject2).a("Colors", arrayOfInt2);
/* 128 */       ((dh)localObject2).a("Type", b);
/* 129 */       ((dh)localObject1).a("Explosion", (dy)localObject2);
/* 130 */       this.a.d((dh)localObject1);
/* 131 */       return true;
/*     */     }
/*     */     
/* 134 */     if ((j == 0) && (i == 0) && (m == 1) && (k > 0) && (k == n))
/*     */     {
/* 136 */       localObject1 = new ArrayList();
/* 137 */       for (int i3 = 0; i3 < paramaae.a(); i3++) {
/* 138 */         add localadd1 = paramaae.a(i3);
/* 139 */         if (localadd1 != null)
/*     */         {
/* 141 */           if (localadd1.b() == ade.aR) {
/* 142 */             ((ArrayList)localObject1).add(Integer.valueOf(acj.c[localadd1.k()]));
/* 143 */           } else if (localadd1.b() == ade.bQ) {
/* 144 */             this.a = localadd1.m();
/* 145 */             this.a.b = 1;
/*     */           } }
/*     */       }
/* 148 */       int[] arrayOfInt1 = new int[((ArrayList)localObject1).size()];
/* 149 */       for (int i4 = 0; i4 < arrayOfInt1.length; i4++) {
/* 150 */         arrayOfInt1[i4] = ((Integer)((ArrayList)localObject1).get(i4)).intValue();
/*     */       }
/* 152 */       if ((this.a != null) && (this.a.p())) {
/* 153 */         dh localdh = this.a.q().m("Explosion");
/* 154 */         if (localdh == null) {
/* 155 */           return false;
/*     */         }
/* 157 */         localdh.a("FadeColors", arrayOfInt1);
/*     */       } else {
/* 159 */         return false;
/*     */       }
/* 161 */       return true;
/*     */     }
/*     */     
/* 164 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */   public add a(aae paramaae)
/*     */   {
/* 170 */     return this.a.m();
/*     */   }
/*     */   
/*     */   public int a()
/*     */   {
/* 175 */     return 10;
/*     */   }
/*     */   
/*     */   public add b()
/*     */   {
/* 180 */     return this.a;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */