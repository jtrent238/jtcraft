/*     */ import java.util.LinkedList;
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
/*     */ public class ata
/*     */   extends avk
/*     */ {
/*  71 */   private List a = new LinkedList();
/*     */   
/*     */ 
/*     */   public ata() {}
/*     */   
/*     */   public ata(int paramInt1, Random paramRandom, int paramInt2, int paramInt3)
/*     */   {
/*  78 */     super(paramInt1);
/*     */     
/*  80 */     this.f = new asv(paramInt2, 50, paramInt3, paramInt2 + 7 + paramRandom.nextInt(6), 54 + paramRandom.nextInt(6), paramInt3 + 7 + paramRandom.nextInt(6));
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(avk paramavk, List paramList, Random paramRandom)
/*     */   {
/*  86 */     int i = d();
/*     */     
/*     */ 
/*     */ 
/*  90 */     int k = this.f.c() - 3 - 1;
/*  91 */     if (k <= 0) {
/*  92 */       k = 1;
/*     */     }
/*     */     
/*     */ 
/*  96 */     int j = 0;
/*  97 */     avk localavk; asv localasv; while (j < this.f.b()) {
/*  98 */       j += paramRandom.nextInt(this.f.b());
/*  99 */       if (j + 3 > this.f.b()) {
/*     */         break;
/*     */       }
/* 102 */       localavk = asx.a(paramavk, paramList, paramRandom, this.f.a + j, this.f.b + paramRandom.nextInt(k) + 1, this.f.c - 1, 2, i);
/*     */       
/* 104 */       if (localavk != null) {
/* 105 */         localasv = localavk.c();
/* 106 */         this.a.add(new asv(localasv.a, localasv.b, this.f.c, localasv.d, localasv.e, this.f.c + 1));
/*     */       }
/* 108 */       j += 4;
/*     */     }
/*     */     
/* 111 */     j = 0;
/* 112 */     while (j < this.f.b()) {
/* 113 */       j += paramRandom.nextInt(this.f.b());
/* 114 */       if (j + 3 > this.f.b()) {
/*     */         break;
/*     */       }
/* 117 */       localavk = asx.a(paramavk, paramList, paramRandom, this.f.a + j, this.f.b + paramRandom.nextInt(k) + 1, this.f.f + 1, 0, i);
/*     */       
/* 119 */       if (localavk != null) {
/* 120 */         localasv = localavk.c();
/* 121 */         this.a.add(new asv(localasv.a, localasv.b, this.f.f - 1, localasv.d, localasv.e, this.f.f));
/*     */       }
/* 123 */       j += 4;
/*     */     }
/*     */     
/* 126 */     j = 0;
/* 127 */     while (j < this.f.d()) {
/* 128 */       j += paramRandom.nextInt(this.f.d());
/* 129 */       if (j + 3 > this.f.d()) {
/*     */         break;
/*     */       }
/* 132 */       localavk = asx.a(paramavk, paramList, paramRandom, this.f.a - 1, this.f.b + paramRandom.nextInt(k) + 1, this.f.c + j, 1, i);
/*     */       
/* 134 */       if (localavk != null) {
/* 135 */         localasv = localavk.c();
/* 136 */         this.a.add(new asv(this.f.a, localasv.b, localasv.c, this.f.a + 1, localasv.e, localasv.f));
/*     */       }
/* 138 */       j += 4;
/*     */     }
/*     */     
/* 141 */     j = 0;
/* 142 */     while (j < this.f.d()) {
/* 143 */       j += paramRandom.nextInt(this.f.d());
/* 144 */       if (j + 3 > this.f.d()) {
/*     */         break;
/*     */       }
/* 147 */       localavk = asx.a(paramavk, paramList, paramRandom, this.f.d + 1, this.f.b + paramRandom.nextInt(k) + 1, this.f.c + j, 3, i);
/*     */       
/* 149 */       if (localavk != null) {
/* 150 */         localasv = localavk.c();
/* 151 */         this.a.add(new asv(this.f.d - 1, localasv.b, localasv.c, this.f.d, localasv.e, localasv.f));
/*     */       }
/* 153 */       j += 4;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean a(ahb paramahb, Random paramRandom, asv paramasv)
/*     */   {
/* 160 */     if (a(paramahb, paramasv)) {
/* 161 */       return false;
/*     */     }
/*     */     
/*     */ 
/* 165 */     a(paramahb, paramasv, this.f.a, this.f.b, this.f.c, this.f.d, this.f.b, this.f.f, ajn.d, ajn.a, true);
/*     */     
/*     */ 
/* 168 */     a(paramahb, paramasv, this.f.a, this.f.b + 1, this.f.c, this.f.d, Math.min(this.f.b + 3, this.f.e), this.f.f, ajn.a, ajn.a, false);
/*     */     
/* 170 */     for (asv localasv : this.a) {
/* 171 */       a(paramahb, paramasv, localasv.a, localasv.e - 2, localasv.c, localasv.d, localasv.e, localasv.f, ajn.a, ajn.a, false);
/*     */     }
/*     */     
/* 174 */     a(paramahb, paramasv, this.f.a, this.f.b + 4, this.f.c, this.f.d, this.f.e, this.f.f, ajn.a, false);
/*     */     
/* 176 */     return true;
/*     */   }
/*     */   
/*     */   protected void a(dh paramdh)
/*     */   {
/* 181 */     dq localdq = new dq();
/* 182 */     for (asv localasv : this.a) {
/* 183 */       localdq.a(localasv.h());
/*     */     }
/* 185 */     paramdh.a("Entrances", localdq);
/*     */   }
/*     */   
/*     */   protected void b(dh paramdh)
/*     */   {
/* 190 */     dq localdq = paramdh.c("Entrances", 11);
/* 191 */     for (int i = 0; i < localdq.c(); i++) {
/* 192 */       this.a.add(new asv(localdq.c(i)));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ata.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */