/*     */ import java.util.Collection;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedList;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class ave
/*     */   extends aqx
/*     */ {
/*     */   private avj e;
/*  15 */   protected Map d = new HashMap();
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public abstract String a();
/*     */   
/*     */ 
/*     */ 
/*     */   protected final void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, aji[] paramArrayOfaji)
/*     */   {
/*  26 */     a(paramahb);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  32 */     if (this.d.containsKey(Long.valueOf(agu.a(paramInt1, paramInt2)))) {
/*  33 */       return;
/*     */     }
/*     */     
/*     */ 
/*  37 */     this.b.nextInt();
/*     */     try
/*     */     {
/*  40 */       if (a(paramInt1, paramInt2))
/*     */       {
/*  42 */         avm localavm = b(paramInt1, paramInt2);
/*  43 */         this.d.put(Long.valueOf(agu.a(paramInt1, paramInt2)), localavm);
/*  44 */         a(paramInt1, paramInt2, localavm);
/*     */       }
/*     */     } catch (Throwable localThrowable) {
/*  47 */       b localb = b.a(localThrowable, "Exception preparing structure feature");
/*  48 */       k localk = localb.a("Feature being prepared");
/*     */       
/*  50 */       localk.a("Is feature chunk", new avf(this, paramInt1, paramInt2));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  57 */       localk.a("Chunk location", String.format("%d,%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
/*     */       
/*  59 */       localk.a("Chunk pos hash", new avg(this, paramInt1, paramInt2));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  66 */       localk.a("Structure type", new avh(this));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  73 */       throw new s(localb);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2)
/*     */   {
/*  79 */     a(paramahb);
/*     */     
/*  81 */     int i = (paramInt1 << 4) + 8;
/*  82 */     int j = (paramInt2 << 4) + 8;
/*     */     
/*  84 */     boolean bool = false;
/*  85 */     for (avm localavm : this.d.values()) {
/*  86 */       if ((localavm.d()) && 
/*  87 */         (localavm.a().a(i, j, i + 15, j + 15))) {
/*  88 */         localavm.a(paramahb, paramRandom, new asv(i, j, i + 15, j + 15));
/*  89 */         bool = true;
/*     */         
/*     */ 
/*  92 */         a(localavm.e(), localavm.f(), localavm);
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*  97 */     return bool;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean b(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 131 */     a(this.c);
/* 132 */     return c(paramInt1, paramInt2, paramInt3) != null;
/*     */   }
/*     */   
/*     */   protected avm c(int paramInt1, int paramInt2, int paramInt3) {
/* 136 */     for (avm localavm : this.d.values()) {
/* 137 */       if ((localavm.d()) && 
/* 138 */         (localavm.a().a(paramInt1, paramInt3, paramInt1, paramInt3)))
/*     */       {
/* 140 */         Iterator localIterator2 = localavm.b().iterator();
/* 141 */         while (localIterator2.hasNext()) {
/* 142 */           avk localavk = (avk)localIterator2.next();
/* 143 */           if (localavk.c().b(paramInt1, paramInt2, paramInt3)) {
/* 144 */             return localavm;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 150 */     return null;
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
/*     */   public boolean d(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 164 */     a(this.c);
/*     */     
/* 166 */     for (avm localavm : this.d.values()) {
/* 167 */       if (localavm.d()) {
/* 168 */         return localavm.a().a(paramInt1, paramInt3, paramInt1, paramInt3);
/*     */       }
/*     */     }
/* 171 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public agt a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 178 */     this.c = paramahb;
/*     */     
/* 180 */     a(paramahb);
/*     */     
/* 182 */     this.b.setSeed(paramahb.H());
/* 183 */     long l1 = this.b.nextLong();
/* 184 */     long l2 = this.b.nextLong();
/* 185 */     long l3 = (paramInt1 >> 4) * l1;
/* 186 */     long l4 = (paramInt3 >> 4) * l2;
/* 187 */     this.b.setSeed(l3 ^ l4 ^ paramahb.H());
/*     */     
/* 189 */     a(paramahb, paramInt1 >> 4, paramInt3 >> 4, 0, 0, null);
/*     */     
/* 191 */     double d1 = Double.MAX_VALUE;
/* 192 */     Object localObject1 = null;
/*     */     
/* 194 */     for (Object localObject2 = this.d.values().iterator(); ((Iterator)localObject2).hasNext();) { localObject3 = (avm)((Iterator)localObject2).next();
/* 195 */       if (((avm)localObject3).d())
/*     */       {
/* 197 */         localObject4 = (avk)((avm)localObject3).b().get(0);
/* 198 */         localagt = ((avk)localObject4).a();
/*     */         
/* 200 */         i = localagt.a - paramInt1;
/* 201 */         j = localagt.b - paramInt2;
/* 202 */         k = localagt.c - paramInt3;
/* 203 */         d2 = i * i + j * j + k * k;
/*     */         
/* 205 */         if (d2 < d1) {
/* 206 */           d1 = d2;
/* 207 */           localObject1 = localagt; } } }
/*     */     Object localObject3;
/*     */     Object localObject4;
/*     */     agt localagt;
/* 211 */     int i; int j; int k; double d2; if (localObject1 != null) {
/* 212 */       return (agt)localObject1;
/*     */     }
/* 214 */     localObject2 = o_();
/* 215 */     if (localObject2 != null) {
/* 216 */       localObject3 = null;
/* 217 */       for (localObject4 = ((List)localObject2).iterator(); ((Iterator)localObject4).hasNext();) { localagt = (agt)((Iterator)localObject4).next();
/*     */         
/* 219 */         i = localagt.a - paramInt1;
/* 220 */         j = localagt.b - paramInt2;
/* 221 */         k = localagt.c - paramInt3;
/* 222 */         d2 = i * i + j * j + k * k;
/*     */         
/* 224 */         if (d2 < d1) {
/* 225 */           d1 = d2;
/* 226 */           localObject3 = localagt;
/*     */         }
/*     */       }
/* 229 */       return (agt)localObject3;
/*     */     }
/*     */     
/* 232 */     return null;
/*     */   }
/*     */   
/*     */ 
/* 236 */   protected List o_() { return null; }
/*     */   
/*     */   private void a(ahb paramahb) {
/*     */     dh localdh1;
/* 240 */     if (this.e == null) {
/* 241 */       this.e = ((avj)paramahb.a(avj.class, a()));
/*     */       
/* 243 */       if (this.e == null) {
/* 244 */         this.e = new avj(a());
/* 245 */         paramahb.a(a(), this.e);
/*     */       } else {
/* 247 */         localdh1 = this.e.a();
/*     */         
/* 249 */         for (String str : localdh1.c()) {
/* 250 */           dy localdy = localdh1.a(str);
/* 251 */           if (localdy.a() == 10) {
/* 252 */             dh localdh2 = (dh)localdy;
/*     */             
/* 254 */             if ((localdh2.c("ChunkX")) && (localdh2.c("ChunkZ"))) {
/* 255 */               int i = localdh2.f("ChunkX");
/* 256 */               int j = localdh2.f("ChunkZ");
/*     */               
/* 258 */               avm localavm = avi.a(localdh2, paramahb);
/* 259 */               if (localavm != null) {
/* 260 */                 this.d.put(Long.valueOf(agu.a(i, j)), localavm);
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(int paramInt1, int paramInt2, avm paramavm) {
/* 270 */     this.e.a(paramavm.a(paramInt1, paramInt2), paramInt1, paramInt2);
/* 271 */     this.e.c();
/*     */   }
/*     */   
/*     */   protected abstract boolean a(int paramInt1, int paramInt2);
/*     */   
/*     */   protected abstract avm b(int paramInt1, int paramInt2);
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ave.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */