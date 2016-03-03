/*     */ import java.util.concurrent.atomic.AtomicReference;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class ex
/*     */ {
/*  76 */   private AtomicReference[] a = new AtomicReference[100];
/*     */   
/*     */   public ex() {
/*  79 */     for (int i = 0; i < 100; i++) {
/*  80 */       this.a[i] = new AtomicReference(new ey(0L, 0, 0.0D, null));
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(int paramInt, long paramLong) {
/*     */     try {
/*  86 */       if ((paramInt < 0) || (paramInt >= 100)) {
/*     */         return;
/*     */       }
/*     */       ey localey1;
/*     */       ey localey2;
/*     */       do {
/*  92 */         localey1 = (ey)this.a[paramInt].get();
/*  93 */         localey2 = localey1.a(paramLong);
/*     */       }
/*  95 */       while (!this.a[paramInt].compareAndSet(localey1, localey2));
/*     */     }
/*     */     catch (Exception localException) {
/*  98 */       if (eu.i().isDebugEnabled()) {
/*  99 */         eu.i().debug(eu.j(), "NetStat failed with packetId: " + paramInt, localException);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public long a() {
/* 105 */     long l = 0L;
/* 106 */     for (int i = 0; i < 100; i++) {
/* 107 */       l += ((ey)this.a[i].get()).a();
/*     */     }
/* 109 */     return l;
/*     */   }
/*     */   
/*     */   public long b() {
/* 113 */     long l = 0L;
/* 114 */     for (int i = 0; i < 100; i++) {
/* 115 */       l += ((ey)this.a[i].get()).b();
/*     */     }
/* 117 */     return l;
/*     */   }
/*     */   
/*     */   public ew c() {
/* 121 */     int i = -1;
/* 122 */     Object localObject = new ey(-1L, -1, 0.0D, null);
/* 123 */     for (int j = 0; j < 100; j++) {
/* 124 */       ey localey = (ey)this.a[j].get();
/* 125 */       if (ey.a(localey) > ey.a((ey)localObject)) {
/* 126 */         i = j;
/* 127 */         localObject = localey;
/*     */       }
/*     */     }
/* 130 */     return new ew(i, (ey)localObject);
/*     */   }
/*     */   
/*     */   public ew d() {
/* 134 */     int i = -1;
/* 135 */     Object localObject = new ey(-1L, -1, 0.0D, null);
/* 136 */     for (int j = 0; j < 100; j++) {
/* 137 */       ey localey = (ey)this.a[j].get();
/* 138 */       if (ey.b(localey) > ey.b((ey)localObject)) {
/* 139 */         i = j;
/* 140 */         localObject = localey;
/*     */       }
/*     */     }
/* 143 */     return new ew(i, (ey)localObject);
/*     */   }
/*     */   
/*     */   public ew a(int paramInt) {
/* 147 */     if ((paramInt < 0) || (paramInt >= 100)) {
/* 148 */       return null;
/*     */     }
/*     */     
/* 151 */     return new ew(paramInt, (ey)this.a[paramInt].get());
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ex.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */