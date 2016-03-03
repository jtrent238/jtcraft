/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.LinkedList;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Map.Entry;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class atx
/*     */   extends ave
/*     */ {
/*  17 */   private static List e = Arrays.asList(new ahu[] { ahu.q, ahu.F, ahu.J, ahu.K, ahu.u });
/*     */   
/*  19 */   private List f = new ArrayList();
/*  20 */   private int g = 32;
/*  21 */   private int h = 8;
/*     */   
/*     */ 
/*     */   public atx()
/*     */   {
/*  26 */     this.f.add(new ahx(yp.class, 1, 1, 1));
/*     */   }
/*     */   
/*     */   public atx(Map paramMap) {
/*  30 */     this();
/*     */     
/*  32 */     for (Map.Entry localEntry : paramMap.entrySet()) {
/*  33 */       if (((String)localEntry.getKey()).equals("distance")) {
/*  34 */         this.g = qh.a((String)localEntry.getValue(), this.g, this.h + 1);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public String a()
/*     */   {
/*  41 */     return "Temple";
/*     */   }
/*     */   
/*     */ 
/*     */   protected boolean a(int paramInt1, int paramInt2)
/*     */   {
/*  47 */     int i = paramInt1;
/*  48 */     int j = paramInt2;
/*  49 */     if (paramInt1 < 0) paramInt1 -= this.g - 1;
/*  50 */     if (paramInt2 < 0) { paramInt2 -= this.g - 1;
/*     */     }
/*  52 */     int k = paramInt1 / this.g;
/*  53 */     int m = paramInt2 / this.g;
/*  54 */     Random localRandom = this.c.A(k, m, 14357617);
/*  55 */     k *= this.g;
/*  56 */     m *= this.g;
/*  57 */     k += localRandom.nextInt(this.g - this.h);
/*  58 */     m += localRandom.nextInt(this.g - this.h);
/*  59 */     paramInt1 = i;
/*  60 */     paramInt2 = j;
/*     */     ahu localahu1;
/*  62 */     if ((paramInt1 == k) && (paramInt2 == m)) {
/*  63 */       localahu1 = this.c.v().a(paramInt1 * 16 + 8, paramInt2 * 16 + 8);
/*  64 */       for (ahu localahu2 : e) {
/*  65 */         if (localahu1 == localahu2) {
/*  66 */           return true;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  71 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */   protected avm b(int paramInt1, int paramInt2)
/*     */   {
/*  77 */     return new aty(this.c, this.b, paramInt1, paramInt2);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean a(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 107 */     avm localavm = c(paramInt1, paramInt2, paramInt3);
/* 108 */     if ((localavm == null) || (!(localavm instanceof aty)) || (localavm.a.isEmpty())) {
/* 109 */       return false;
/*     */     }
/* 111 */     avk localavk = (avk)localavm.a.getFirst();
/* 112 */     return localavk instanceof auf;
/*     */   }
/*     */   
/*     */   public List b() {
/* 116 */     return this.f;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\atx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */