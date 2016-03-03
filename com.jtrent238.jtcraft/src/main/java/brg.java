/*     */ import com.google.common.base.Joiner;
/*     */ import com.google.common.collect.Iterables;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class brg
/*     */   implements bqv
/*     */ {
/*  21 */   private static final Logger a = ;
/*  22 */   private static final Joiner b = Joiner.on(", ");
/*  23 */   private final Map c = Maps.newHashMap();
/*  24 */   private final List d = Lists.newArrayList();
/*  25 */   private final Set e = Sets.newLinkedHashSet();
/*     */   private final brw f;
/*     */   
/*     */   public brg(brw parambrw) {
/*  29 */     this.f = parambrw;
/*     */   }
/*     */   
/*     */   public void a(bra parambra)
/*     */   {
/*  34 */     for (String str : parambra.c()) {
/*  35 */       this.e.add(str);
/*  36 */       bqq localbqq = (bqq)this.c.get(str);
/*  37 */       if (localbqq == null) {
/*  38 */         localbqq = new bqq(this.f);
/*  39 */         this.c.put(str, localbqq);
/*     */       }
/*  41 */       localbqq.a(parambra);
/*     */     }
/*     */   }
/*     */   
/*     */   public Set a()
/*     */   {
/*  47 */     return this.e;
/*     */   }
/*     */   
/*     */   public bqw a(bqx parambqx)
/*     */   {
/*  52 */     bqy localbqy = (bqy)this.c.get(parambqx.b());
/*     */     
/*  54 */     if (localbqy != null) {
/*  55 */       return localbqy.a(parambqx);
/*     */     }
/*     */     
/*  58 */     throw new FileNotFoundException(parambqx.toString());
/*     */   }
/*     */   
/*     */   public List b(bqx parambqx)
/*     */   {
/*  63 */     bqy localbqy = (bqy)this.c.get(parambqx.b());
/*     */     
/*  65 */     if (localbqy != null) {
/*  66 */       return localbqy.b(parambqx);
/*     */     }
/*     */     
/*  69 */     throw new FileNotFoundException(parambqx.toString());
/*     */   }
/*     */   
/*     */   private void b() {
/*  73 */     this.c.clear();
/*  74 */     this.e.clear();
/*     */   }
/*     */   
/*     */   public void a(List paramList)
/*     */   {
/*  79 */     b();
/*     */     
/*  81 */     a.info("Reloading ResourceManager: " + b.join(Iterables.transform(paramList, new brh(this))));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  88 */     for (bra localbra : paramList) {
/*  89 */       a(localbra);
/*     */     }
/*     */     
/*  92 */     c();
/*     */   }
/*     */   
/*     */   public void a(bqz parambqz)
/*     */   {
/*  97 */     this.d.add(parambqz);
/*     */     
/*  99 */     parambqz.a(this);
/*     */   }
/*     */   
/*     */   private void c() {
/* 103 */     for (bqz localbqz : this.d) {
/* 104 */       localbqz.a(this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\brg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */