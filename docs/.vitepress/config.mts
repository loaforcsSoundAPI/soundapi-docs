import { defineConfig } from 'vitepress'

// https://vitepress.dev/reference/site-config
export default defineConfig({
  title: "loaforcsSoundAPI",
  description: "A VitePress Site",
  themeConfig: {
    // https://vitepress.dev/reference/default-theme-config
    nav: [
      { text: 'Home', link: '/' },
      { text: 'Sound-Pack Tutorial', link: '/soundpack-tutorials/guide/getting-started' },
      { text: 'C# API', link: '/csharp-api/csharp-api' }
    ],

    sidebar: [
      {
        text: 'Sound-Pack Tutorials',
        items: [
          { text: 'Recommended Tools', link: '/soundpack-tutorials/recommended-tools' },
          { text: 'Naming Conventions', link: '/soundpack-tutorials/naming-convention' },
          { 
            text: 'Guide', 
            items: [
              { text: 'Getting Started', link: '/soundpack-tutorials/guide/getting-started' },
              { text: 'Replacer Basics', link: '/soundpack-tutorials/guide/replacer-basics' },
              { text: 'Match Strings', link: '/soundpack-tutorials/guide/match-strings' }
            ]
          },
          {
            text: 'Advanced',
            items: [
              { text: 'Conditions', link: '/soundpack-tutorials/advanced/conditions' },
              { text: 'Config', link: '/soundpack-tutorials/advanced/config' },
              { text: 'Update Every Frame', link: '/soundpack-tutorials/advanced/update-every-frame' }
            ]
          },
          { text: 'Migrating from v1', link: '/soundpack-tutorials/migrating-from-v1' },
          { text: 'Migrating from CustomSounds', link: '/soundpack-tutorials/migrating-from-customsounds' }
        ]
      },

      {
        text: 'Sound-Pack API',
        items: [
          { text: 'Mappings', link: '/soundpack-api/mappings' }
        ]
      },

      {
        text: 'C# API',
        items: [
          { text: 'Introduction', link: '/csharp-api/csharp-api' },
          { text: 'Custom Conditions', link: '/csharp-api/conditions' },
          { text: 'Custom Report Sections', link: '/csharp-api/report-sections' }
        ]
      }
    ],

    socialLinks: [
      { icon: 'github', link: 'https://github.com/vuejs/vitepress' }
    ]
  }
})
