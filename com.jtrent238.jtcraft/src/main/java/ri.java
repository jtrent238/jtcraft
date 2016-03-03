/*     */ import com.google.common.collect.Maps;
/*     */ import java.lang.management.ManagementFactory;
/*     */ import java.lang.management.RuntimeMXBean;
/*     */ import java.net.MalformedURLException;
/*     */ import java.net.URL;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.Map;
/*     */ import java.util.Map.Entry;
/*     */ import java.util.Set;
/*     */ import java.util.Timer;
/*     */ import java.util.UUID;
/*     */ 
/*     */ public class ri
/*     */ {
/*  16 */   private final Map a = Maps.newHashMap();
/*  17 */   private final Map b = Maps.newHashMap();
/*     */   
/*  19 */   private final String c = UUID.randomUUID().toString();
/*     */   private final URL d;
/*     */   private final rk e;
/*  22 */   private final Timer f = new Timer("Snooper Timer", true);
/*  23 */   private final Object g = new Object();
/*     */   private final long h;
/*     */   private boolean i;
/*     */   private int j;
/*     */   
/*     */   public ri(String paramString, rk paramrk, long paramLong) {
/*     */     try {
/*  30 */       this.d = new URL("http://snoop.minecraft.net/" + paramString + "?version=" + 2);
/*     */     } catch (MalformedURLException localMalformedURLException) {
/*  32 */       throw new IllegalArgumentException();
/*     */     }
/*     */     
/*  35 */     this.e = paramrk;
/*  36 */     this.h = paramLong;
/*     */   }
/*     */   
/*     */   public void a() {
/*  40 */     if (this.i) return;
/*  41 */     this.i = true;
/*     */     
/*  43 */     h();
/*     */     
/*  45 */     this.f.schedule(new rj(this), 0L, 900000L);
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
/*     */   private void h()
/*     */   {
/*  64 */     i();
/*     */     
/*  66 */     a("snooper_token", this.c);
/*  67 */     b("snooper_token", this.c);
/*  68 */     b("os_name", System.getProperty("os.name"));
/*  69 */     b("os_version", System.getProperty("os.version"));
/*  70 */     b("os_architecture", System.getProperty("os.arch"));
/*  71 */     b("java_version", System.getProperty("java.version"));
/*  72 */     b("version", "1.7.10");
/*     */     
/*  74 */     this.e.b(this);
/*     */   }
/*     */   
/*     */   private void i() {
/*  78 */     RuntimeMXBean localRuntimeMXBean = ManagementFactory.getRuntimeMXBean();
/*  79 */     java.util.List localList = localRuntimeMXBean.getInputArguments();
/*  80 */     int k = 0;
/*     */     
/*  82 */     for (String str : localList) {
/*  83 */       if (str.startsWith("-X")) {
/*  84 */         a("jvm_arg[" + k++ + "]", str);
/*     */       }
/*     */     }
/*     */     
/*  88 */     a("jvm_args", Integer.valueOf(k));
/*     */   }
/*     */   
/*     */   public void b() {
/*  92 */     b("memory_total", Long.valueOf(Runtime.getRuntime().totalMemory()));
/*  93 */     b("memory_max", Long.valueOf(Runtime.getRuntime().maxMemory()));
/*  94 */     b("memory_free", Long.valueOf(Runtime.getRuntime().freeMemory()));
/*  95 */     b("cpu_cores", Integer.valueOf(Runtime.getRuntime().availableProcessors()));
/*     */     
/*  97 */     this.e.a(this);
/*     */   }
/*     */   
/*     */   public void a(String paramString, Object paramObject) {
/* 101 */     synchronized (this.g) {
/* 102 */       this.b.put(paramString, paramObject);
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(String paramString, Object paramObject) {
/* 107 */     synchronized (this.g) {
/* 108 */       this.a.put(paramString, paramObject);
/*     */     }
/*     */   }
/*     */   
/*     */   public Map c() {
/* 113 */     LinkedHashMap localLinkedHashMap = new LinkedHashMap();
/*     */     Iterator localIterator;
/* 115 */     Map.Entry localEntry; synchronized (this.g) {
/* 116 */       b();
/*     */       
/* 118 */       for (localIterator = this.a.entrySet().iterator(); localIterator.hasNext();) { localEntry = (Map.Entry)localIterator.next();
/* 119 */         localLinkedHashMap.put(localEntry.getKey(), localEntry.getValue().toString());
/*     */       }
/*     */       
/* 122 */       for (localIterator = this.b.entrySet().iterator(); localIterator.hasNext();) { localEntry = (Map.Entry)localIterator.next();
/* 123 */         localLinkedHashMap.put(localEntry.getKey(), localEntry.getValue().toString());
/*     */       }
/*     */     }
/*     */     
/* 127 */     return localLinkedHashMap;
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 131 */     return this.i;
/*     */   }
/*     */   
/*     */   public void e() {
/* 135 */     this.f.cancel();
/*     */   }
/*     */   
/*     */   public String f() {
/* 139 */     return this.c;
/*     */   }
/*     */   
/*     */   public long g() {
/* 143 */     return this.h;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ri.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */